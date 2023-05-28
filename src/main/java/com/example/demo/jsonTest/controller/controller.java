package com.example.demo.jsonTest.controller;

import com.example.demo.jsonTest.Repository.CustomerRepository;
import com.example.demo.jsonTest.Repository.ProductRepository;
import com.example.demo.jsonTest.dto.OrderRequest;
import com.example.demo.jsonTest.dto.OrderResponse;
import com.example.demo.jsonTest.entity.Customer;
import com.example.demo.jsonTest.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/peace/placeorder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }


    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){

        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){

        return customerRepository.getJoinInformation();
    }
}
