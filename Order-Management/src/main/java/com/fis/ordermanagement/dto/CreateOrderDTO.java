package com.fis.ordermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrderDTO {

    private Long customerId;

    private ArrayList<ProductQuantityDTO> orderItemInfo;
}
