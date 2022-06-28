package com.fis.ordermanagement.service.impl;

import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.exception.CustomerNotFoundException;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.repository.CustomerRepo;
import com.fis.ordermanagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private final CustomerRepo customerRepo;
    public CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }
    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Page<CustomerDTO> findAll(Pageable pageable) {
        log.info("Query all customer: PageNumber: {}, PageSize: {}", pageable.getPageNumber(), pageable.getPageSize());
        return customerRepo.findAll(pageable).map(CustomerDTO.Mapper::mapCustomer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepo.findById(id).orElseThrow();
    }

    @Override
    public CustomerDTO update(Long customerId, CustomerDTO customerDTO) {
        Customer savedCustomer = customerRepo.findById(customerId).get();
        savedCustomer.setAddress(customerDTO.getAddress());
        savedCustomer.setMobile(customerDTO.getMobile());
        Customer updatedCustomer = customerRepo.save(savedCustomer);
        return CustomerDTO.Mapper.mapCustomer(updatedCustomer);
    }

    @Override
    public void delete(Long id) {
        Customer deleteCustomer=customerRepo.findById(id).orElseThrow();
        //if (deleteCustomer==null) throw new CustomerNotFoundException();
        customerRepo.delete(deleteCustomer);
    }
}
