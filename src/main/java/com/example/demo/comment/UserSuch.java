package com.example.demo.comment;

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
