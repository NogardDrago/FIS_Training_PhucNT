package com.fis.ordermanagement.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.dto.NewCustomerDTO;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class CustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerService customerService;
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void findAll() {
    }

    @Test
    void findById() throws Exception {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void save() throws Exception{
        int pageNumber = 1;
        int pageSize = 5;
        NewCustomerDTO createCustomerDTO = NewCustomerDTO.builder()
                .name("A")
                .address("Ha Noi")
                .mobile("0123456789")
                .build();
        CustomerDTO customerDTO = CustomerDTO.builder()
                .name("B")
                .address("Hung Yen")
                .mobile("0123456879")
                .build();
        CustomerDTO customerDTO1 = CustomerDTO.builder()
                .name("C")
                .address("Ha Noi")
                .mobile("0123456897")
                .build();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        customerDTOList.add(customerDTO1);
        customerDTOList.add(customerDTO);
        Page<CustomerDTO> customerDTOPage = new PageImpl<>(customerDTOList);
        Mockito.when(customerService.save(createCustomerDTO, PageRequest.of(pageNumber, pageSize)))
                .thenReturn(customerDTOPage);

        ResultActions response = mockMvc.perform(post("/api/customer/{pageNumber}/{pageSize}", pageNumber, pageSize)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createCustomerDTO)));
        response.andExpect(status().isOk());

    }
}