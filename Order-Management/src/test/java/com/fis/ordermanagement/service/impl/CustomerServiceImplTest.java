package com.fis.ordermanagement.service.impl;

import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.dto.NewCustomerDTO;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.repository.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@SpringBootTest
@Slf4j
class CustomerServiceImplTest {
    private CustomerServiceImpl customerService;

    private CustomerRepo customerRepo;
    private Customer customer;
    private Pageable pageable;

    @Test
    void save() {
            CustomerDTO customerDTO = CustomerDTO.builder()
                    .name("Nguyen Van A")
                    .address("Ha Noi")
                    .mobile("0941561672")
                    .build();

            customerService.save(customerDTO);

            CustomerDTO c = customerService.findById(10L);
            assertEquals("Ha Noi",c.getAddress());
            assertEquals("0941561672",c.getMobile());
            assertEquals("Nguyen Van A",c.getName());
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }
}