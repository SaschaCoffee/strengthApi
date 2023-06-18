package com.example.demo.fitnessAppApi.service;

import com.example.demo.fitnessAppApi.entity.User;

import java.util.Optional;

public interface userService {
    Optional<User> findbyId(Long id);
}
