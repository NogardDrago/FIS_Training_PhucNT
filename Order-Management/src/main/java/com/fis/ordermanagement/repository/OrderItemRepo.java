package com.fis.ordermanagement.repository;

import com.fis.ordermanagement.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
}
