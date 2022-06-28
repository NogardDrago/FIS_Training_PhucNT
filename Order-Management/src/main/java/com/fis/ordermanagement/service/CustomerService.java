package com.fis.ordermanagement.service;

import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Page<CustomerDTO> findAll(Pageable pageable);
    Customer findById(Long id);
    CustomerDTO update(Long customerId, CustomerDTO customerDTO);
    void delete(Long id);
}
