package com.fis.ordermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewCustomerDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String mobile;
    @NotBlank
    private String address;
}
