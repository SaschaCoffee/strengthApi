package com.example.demo.jsonTest.Repository;

import com.example.demo.jsonTest.dto.OrderResponse;
import com.example.demo.jsonTest.entity.Customer;
import com.example.demo.jsonTest.entity.Product;
import jakarta.persistence.NoResultException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public interface myRepository extends JpaRepository<Product, Integer>  {




    @Query("SELECT p from Product p where p.customer.id = Customer.id")
    public List<OrderResponse> getJoinInformation();
    Collection<Customer> existsCustomerBy = new LinkedList<Customer>();



}
