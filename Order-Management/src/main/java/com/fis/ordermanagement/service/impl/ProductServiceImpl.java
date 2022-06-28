package com.fis.ordermanagement.service.impl;

import com.fis.ordermanagement.exception.ProductNotFoundException;
import com.fis.ordermanagement.model.Product;
import com.fis.ordermanagement.repository.ProductRepo;
import com.fis.ordermanagement.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).orElseThrow(() -> {
            try {
                throw new ProductNotFoundException(String.format("Cant find product with id %s", id));
            } catch (ProductNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }
}
