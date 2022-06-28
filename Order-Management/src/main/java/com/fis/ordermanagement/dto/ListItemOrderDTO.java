package com.fis.ordermanagement.dto;

import com.fis.ordermanagement.model.Order;
import com.fis.ordermanagement.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListItemOrderDTO {
    private Long id;

    private LocalDateTime orderDateTime;

    private CustomerDTO customerDTO;

    private Double totalAmount;

    private List<OrderItemDTO> orderItemDTOs;

    private OrderStatus status;

    public static class Mapper {
        public static ListItemOrderDTO mapListItem(Order order) {
            return ListItemOrderDTO.builder()
                    .id(order.getId())
                    .orderDateTime(order.getOrderDateTime())
                    .customerDTO(CustomerDTO.Mapper.mapCustomer(order.getCustomer()))
                    .totalAmount(order.getTotalAmount())
                    .orderItemDTOs(order.getOrderItem().stream()
                            .map(OrderItemDTO.Mapper::mapOrderItem)
                            .collect(Collectors.toList()))
                    .status(order.getStatus())
                    .build();
        }
    }
}
