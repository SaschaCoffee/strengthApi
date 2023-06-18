package com.example.demo.fitnessAppApi.service;

import com.example.demo.fitnessAppApi.Repository.TrainingRepository;
import com.example.demo.fitnessAppApi.Repository.UserRepository;
import com.example.demo.fitnessAppApi.entity.User;
import com.example.demo.fitnessAppApi.entity.trainingsdaten;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private UserRepository userRepository;

    public trainingsdaten saveTraining(trainingsdaten trainingsdatenn, Long userid){

        Optional<User> user = userRepository.findById(1L);

        trainingsdatenn.setUser(user.get());

        return trainingRepository.save(trainingsdatenn);

    }
}
