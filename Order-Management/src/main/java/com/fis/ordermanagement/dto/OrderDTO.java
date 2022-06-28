package com.fis.ordermanagement.dto;

import com.fis.ordermanagement.model.Order;
import com.fis.ordermanagement.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    @NotBlank
    private Long id;
    @NotBlank
    private LocalDateTime orderDateTime;
    @NotBlank
    private Long customerId;
    @NotBlank
    private Double totalAmount;
    @NotBlank
    private OrderStatus status;
    public static class Mapper {
        public static OrderDTO mapOrder(Order order) {
            return OrderDTO.builder()
                    .id(order.getId())
                    .customerId(order.getCustomer().getId())
                    .orderDateTime(order.getOrderDateTime())
                    .status(order.getStatus())
                    .totalAmount(order.getTotalAmount())
                    .build();
        }
    }
}
