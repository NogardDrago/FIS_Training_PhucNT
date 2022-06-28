package com.fis.ordermanagement.service;

import com.fis.ordermanagement.model.Product;

public interface ProductService {
    Product findById(Long id);
    Product save(Product product);
}
