package com.example.demo.fitnessAppApi;

import com.example.demo.fitnessAppApi.Repository.UserRepository;
import com.example.demo.fitnessAppApi.entity.User;
import com.example.demo.fitnessAppApi.service.userService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSuch implements userService {

    private final UserRepository userRepository;

    public UserSuch(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findbyId(Long id) {
        return userRepository.findById(id);
    }
}
