package com.fis.ordermanagement.controller;

import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/customer")
@Slf4j
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/{pageNumber}/{pageSize}")
    public Page<CustomerDTO> findAll(@PathVariable(name = "pageNumber") Integer pageNumber
            , @PathVariable(name = "pageSize") Integer pageSize) {
        log.info("Response All Customer. PageNumber: {}, PageSize: {}", pageNumber, pageSize);
        return customerService.findAll(PageRequest.of(pageNumber, pageSize));
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> findById(@PathVariable(name="customerId") Long customerId) {
        Customer customer = customerService.findById(customerId);
        CustomerDTO customerDTO = CustomerDTO.Mapper.mapCustomer(customer);
        log.info("Customer with id: {}", customerDTO);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<String> delete(@PathVariable("customerId") Long customerId) {
        customerService.delete(customerId);
        return new ResponseEntity<>(("Customer deleted successfully!"), HttpStatus.OK);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> update(@PathVariable("customerId") Long customerId,
                                              @RequestBody CustomerDTO customerDTO) {
        CustomerDTO updatedCustomer = customerService.update(customerId, customerDTO);
        log.info("Updated customer: {}", updatedCustomer);
        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
    }

}
