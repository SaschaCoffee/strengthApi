package com.example.demo.jsonTest.Repository;

import com.example.demo.jsonTest.dto.OrderResponse;
import com.example.demo.jsonTest.entity.Customer;
import com.example.demo.jsonTest.entity.Product;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {



    @Query("SELECT new com.example.demo.jsonTest.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();




}
