package com.fis.ordermanagement.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(CustomerController.class)
@Slf4j
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
}