package com.example.demo.comment;

import java.util.Optional;

public interface userService {
    Optional<User> findbyId(Long id);
}
