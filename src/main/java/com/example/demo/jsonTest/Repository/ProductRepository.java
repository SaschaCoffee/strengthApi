package com.example.demo.jsonTest.Repository;

import com.example.demo.jsonTest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

