package com.example.demo.jsonTest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private int id;
    private String name;

    private String email;

    private String gender;

    public Customer(int id, String name, String email, String gender, List<Product> products) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", products=" + products +
                '}';
    }

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.MERGE, fetch=FetchType.LAZY)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;
}
