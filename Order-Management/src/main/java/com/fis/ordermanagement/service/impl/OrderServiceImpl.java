package com.fis.ordermanagement.service.impl;

import com.fis.ordermanagement.dto.AddOrderItemDTO;
import com.fis.ordermanagement.dto.CreateOrderDTO;
import com.fis.ordermanagement.dto.OrderDTO;
import com.fis.ordermanagement.dto.RemoveItemDTO;
import com.fis.ordermanagement.exception.*;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.model.Order;
import com.fis.ordermanagement.model.OrderItem;
import com.fis.ordermanagement.model.Product;
import com.fis.ordermanagement.model.enums.OrderStatus;
import com.fis.ordermanagement.repository.OrderItemRepo;
import com.fis.ordermanagement.repository.OrderRepo;
import com.fis.ordermanagement.service.CustomerService;
import com.fis.ordermanagement.service.OrderService;
import com.fis.ordermanagement.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private final OrderRepo orderRepo;
    @Autowired
    private final CustomerService customerService;
    @Autowired
    private final ProductService productService;
    @Autowired
    private OrderItemRepo orderItemRepo;
    public OrderServiceImpl(OrderRepo orderRepo, CustomerService customerService, ProductService productService) {
        this.orderRepo = orderRepo;
        this.customerService = customerService;
        this.productService = productService;
    }

    @Override
    public Order save(CreateOrderDTO createOrderDTO) {
        Customer customer = customerService.findById(createOrderDTO.getCustomerId());
        List<OrderItem> orderItemList = new ArrayList<>();
        createOrderDTO.getOrderItemInfo().forEach(productQuantityDTO -> {
            Product product = productService.findById(productQuantityDTO.getProductId());
            if (product.getAvailable() < productQuantityDTO.getQuantity()) {
                try {
                    throw new OutOfProductException(String.format("Out of Product %s", product.getName()));
                } catch (OutOfProductException e) {
                    throw new RuntimeException(e);
                }
            }
            OrderItem orderItem = OrderItem.builder()
                    .product(product)
                    .quantity(productQuantityDTO.getQuantity())
                    .amount(product.getPrice() * productQuantityDTO.getQuantity())
                    .build();
            orderItemList.add(orderItem);
        });
        Order order = Order.builder()
                .orderDateTime(LocalDateTime.now())
                .status(OrderStatus.CREATED)
                .customer(customer)
                .orderItem(orderItemList)
                .totalAmount(orderItemList.stream().mapToDouble(OrderItem::getAmount).sum())
                .build();
        orderRepo.save(order);
        return order;
    }


    @Override
    public Page<OrderDTO> findAll(Pageable pageable) {
        log.info("All order: PageNumber: {}, PageSize: {}", pageable.getPageNumber(), pageable.getPageSize());
        return orderRepo.findAll(pageable).map(OrderDTO.Mapper::mapOrder);
    }

    @Override
    public Order findById(Long id) {
        return orderRepo.findById(id).orElseThrow(() -> {
            try {
                throw new OrderNotFoundException(String.format("Cant find order with id %s", id));
            } catch (OrderNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void delete(Long id) {

        Order order = findById(id);
        if (OrderStatus.PAID.equals(order.getStatus())) {
            try {
                throw new CanNotDeletePaidOrderException("Cant delete Paid order");
            } catch (CanNotDeletePaidOrderException e) {
                throw new RuntimeException(e);
            }
        }
        orderRepo.deleteById(id);
    }

    @Override
    public Order addOrderItem(AddOrderItemDTO addOrderItemDTO) {
        Order order = findById(addOrderItemDTO.getOrderId());
        if (null == order) {
            try {
                throw new OrderNotFoundException(String.format("Cant find order with id %s", addOrderItemDTO.getOrderId()));
            } catch (OrderNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if (!OrderStatus.CREATED.equals(order.getStatus())) {
            try {
                throw new CanOnlyChangeCreatedOrderException("Can only add order item to Created order");
            } catch (CanOnlyChangeCreatedOrderException e) {
                throw new RuntimeException(e);
            }
        }
        Product product = productService.findById(addOrderItemDTO.getProductId());
        if (product.getAvailable() < addOrderItemDTO.getQuantity()) {
            try {
                throw new OutOfProductException(String.format("Out of %s product", product.getName()));
            } catch (OutOfProductException e) {
                throw new RuntimeException(e);
            }
        }
        OrderItem newOrderItem = OrderItem.builder()
                .amount(product.getPrice() * addOrderItemDTO.getQuantity())
                .quantity(addOrderItemDTO.getQuantity())
                .order(order)
                .product(product)
                .build();
        order.setTotalAmount(order.getTotalAmount() + newOrderItem.getAmount());
        order.getOrderItem().add(newOrderItem);
        orderRepo.save(order);
        product.setAvailable(product.getAvailable() - addOrderItemDTO.getQuantity());
        productService.save(product);
        return findById(addOrderItemDTO.getOrderId());
    }

    @Override
    public Order removeOrderItem(RemoveItemDTO removeItemDTO) {
        Order order = findById(removeItemDTO.getOrderId());
        if (null == order) {
            try {
                throw new OrderNotFoundException(String.format("Not found order with id %s", removeItemDTO.getOrderId()));
            } catch (OrderNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if (!OrderStatus.CREATED.equals(order.getStatus())) {
            try {
                throw new CanOnlyChangeCreatedOrderException("Can only delete created order");
            } catch (CanOnlyChangeCreatedOrderException e) {
                throw new RuntimeException(e);
            }
        }
        OrderItem orderItem = orderItemRepo.findById(removeItemDTO.getOrderItemId()).orElseThrow(() -> {
            try {
                throw new OrderItemNotFoundException(String.format("Cant find order item with id %s", removeItemDTO.getOrderItemId()));
            } catch (OrderItemNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        order.setTotalAmount(order.getTotalAmount() - orderItem.getAmount());
        Product product = productService.findById(orderItem.getProduct().getId());
        product.setAvailable(product.getAvailable() + orderItem.getQuantity());
        orderItemRepo.deleteById(removeItemDTO.getOrderItemId());
        return findById(removeItemDTO.getOrderId());
    }

    @Override
    public Order paid(Long orderId) {
        Order order = findById(orderId);
        if (!OrderStatus.CREATED.equals(order.getStatus())) {
            try {
                throw new CanOnlyChangeCreatedOrderException(
                        "Can only change status of created order");
            } catch (CanOnlyChangeCreatedOrderException e) {
                throw new RuntimeException(e);
            }
        }
        order.setStatus(OrderStatus.PAID);
        orderRepo.save(order);
        return order;
    }

    @Override
    public Order cancel(Long orderId) {
        Order order = findById(orderId);
        if (!OrderStatus.CREATED.equals(order.getStatus())) {
            try {
                throw new CanOnlyChangeCreatedOrderException(
                        "Can only change status of created order");
            } catch (CanOnlyChangeCreatedOrderException e) {
                throw new RuntimeException(e);
            }
        }
        order.setStatus(OrderStatus.CANCELED);
        orderRepo.save(order);
        return order;
    }
}
