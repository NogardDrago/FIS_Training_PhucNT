package com.fis.ordermanagement.service.impl;

import com.fis.ordermanagement.dto.CustomerDTO;
import com.fis.ordermanagement.dto.NewCustomerDTO;
import com.fis.ordermanagement.exception.CustomerNotFoundException;
import com.fis.ordermanagement.model.Customer;
import com.fis.ordermanagement.repository.CustomerRepo;
import com.fis.ordermanagement.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private final CustomerRepo customerRepo;
    public CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }
    @Override
    public Page<CustomerDTO> save(NewCustomerDTO customerDTO, Pageable pageable) {
        Customer customer = Customer.builder()
                .name(customerDTO.getName())
                .mobile(customerDTO.getMobile())
                .address(customerDTO.getAddress())
                .build();
        customerRepo.save(customer);
        return findAll(pageable);
    }

    @Override
    public Page<CustomerDTO> findAll(Pageable pageable) {
        log.info("All customer: PageNumber: {}, PageSize: {}", pageable.getPageNumber(), pageable.getPageSize());
        return customerRepo.findAll(pageable).map(CustomerDTO.Mapper::mapCustomer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepo.findById(id).orElseThrow(() -> {
            try {
                throw new CustomerNotFoundException(String.format("Cant find customer id %s",id));
            } catch (CustomerNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
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
        customerRepo.delete(deleteCustomer);
    }
}
