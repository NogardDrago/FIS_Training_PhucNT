package com.fis.ordermanagement.repository;

import com.fis.ordermanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
