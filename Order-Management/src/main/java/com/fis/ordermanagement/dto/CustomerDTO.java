package com.fis.ordermanagement.dto;

import com.fis.ordermanagement.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    @NotBlank
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String mobile;
    @NotBlank
    private String address;
    public static class Mapper{
        public static CustomerDTO mapCustomer(Customer customer){
            return CustomerDTO.builder().id(customer.getId()).name(customer.getName()).mobile(customer.getMobile()).address(customer.getAddress()).build();
        }
    }
}
