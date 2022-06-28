package com.fis.ordermanagement.dto;

import com.fis.ordermanagement.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Long id;

    private String name;

    private Double price;

    private Long avaiable;

    public static class Mapper {
        public static ProductDTO mapProduct(Product product) {
            return ProductDTO.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .price(product.getPrice())
                    .avaiable(product.getAvailable())
                    .build();
        }
    }
}
