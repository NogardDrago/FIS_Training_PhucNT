package com.fis.ordermanagement.controller;

import com.fis.ordermanagement.dto.*;
import com.fis.ordermanagement.model.Order;
import com.fis.ordermanagement.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/order")
@Slf4j
public class OrderController {
    @Autowired
    private final OrderService  orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{pageNumber}/{pageSize}")
    public Page<OrderDTO> findAll(@PathVariable("pageNumber") Integer pageNumber,
                                  @PathVariable("pageSize") Integer pageSize) {
        log.info("All order. PageNumber: {}, PageSize: {}", pageNumber, pageSize);
        return orderService.findAll(PageRequest.of(pageNumber, pageSize));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<ListItemOrderDTO> findById(@PathVariable("orderId") Long orderId) {
        Order order = orderService.findById(orderId);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(order);
        log.info("Order with id {}: {}", orderId,orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ListItemOrderDTO> save(@RequestBody CreateOrderDTO createOrderDTO) {
        log.info("CreateOrderDTO: {}", createOrderDTO);
        Order savedOrder = orderService.save(createOrderDTO);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(savedOrder);
        log.info("Saved Detail Order: {}", orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<String> delete(@PathVariable("orderId") Long orderId) {
        orderService.delete(orderId);
        return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
    }

    @PostMapping("/addOrderItem")
    public ResponseEntity<ListItemOrderDTO> addOrderItem(@RequestBody AddOrderItemDTO addOrderItemDTO) {
        log.info("Order Item: {}", addOrderItemDTO);
        Order order = orderService.addOrderItem(addOrderItemDTO);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(order);
        log.info("DetailOrderDTO (Added new OrderItem): {}", orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PostMapping("/removeOrderItem")
    public ResponseEntity<ListItemOrderDTO> removeOrderItem(@RequestBody RemoveItemDTO removeItemDTO) {
        log.info("Remove Item: {}", removeItemDTO);
        Order order = orderService.removeOrderItem(removeItemDTO);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(order);
        log.info("DetailOrderDTO (Removed): {}", orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PostMapping("/paid/{orderId}")
    public ResponseEntity<ListItemOrderDTO> paid(@PathVariable("orderId") Long orderId) {
        Order order = orderService.paid(orderId);
        log.info("Updated status: {}", order);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(order);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @PostMapping("/cancel/{orderId}")
    public ResponseEntity<ListItemOrderDTO> cancel(@PathVariable("orderId") Long orderId) {
        Order order = orderService.cancel(orderId);
        log.info("DetailOrderDTO updated Cancelled status: {}", order);
        ListItemOrderDTO orderList = ListItemOrderDTO.Mapper.mapListItem(order);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }
}
