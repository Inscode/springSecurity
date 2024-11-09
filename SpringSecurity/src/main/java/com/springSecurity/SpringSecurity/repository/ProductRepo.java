package com.springSecurity.SpringSecurity.repository;

import com.springSecurity.SpringSecurity.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
