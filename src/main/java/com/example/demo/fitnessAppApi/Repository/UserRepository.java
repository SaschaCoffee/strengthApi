package com.example.demo.fitnessAppApi.Repository;

import com.example.demo.fitnessAppApi.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Long> {

}
