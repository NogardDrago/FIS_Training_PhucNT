package com.fis.ordermanagement.dto;

import com.fis.ordermanagement.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDTO {
    private Long id;

    private ProductDTO productDTO;

    private Long quantity;

    private Double amount;

    public static class Mapper {
        public static OrderItemDTO mapOrderItem(OrderItem orderItem) {
            return OrderItemDTO.builder()
                    .id(orderItem.getId())
                    .productDTO(ProductDTO.Mapper.mapProduct(orderItem.getProduct()))
                    .quantity(orderItem.getQuantity())
                    .amount(orderItem.getAmount())
                    .build();
        }
    }
}
