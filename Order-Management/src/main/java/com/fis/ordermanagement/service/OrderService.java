package com.fis.ordermanagement.service;

import com.fis.ordermanagement.dto.AddOrderItemDTO;
import com.fis.ordermanagement.dto.CreateOrderDTO;
import com.fis.ordermanagement.dto.OrderDTO;
import com.fis.ordermanagement.dto.RemoveItemDTO;
import com.fis.ordermanagement.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    Order save(CreateOrderDTO createOrderDTO);
    Page<OrderDTO> findAll(Pageable pageable);
    Order findById(Long orderId);
    void delete(Long orderId);
    Order addOrderItem(AddOrderItemDTO addOrderItemDTO);
    Order removeOrderItem(RemoveItemDTO removeItemDTO);
}
