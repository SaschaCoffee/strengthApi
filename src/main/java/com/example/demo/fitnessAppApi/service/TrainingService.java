package com.example.demo.fitnessAppApi.service;

import com.example.demo.fitnessAppApi.Repository.TrainingRepository;
import com.example.demo.fitnessAppApi.Repository.UserRepository;
import com.example.demo.fitnessAppApi.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private UserRepository userRepository;

    private trainingDTOMapper trainingDTOMapper;

    public trainingsdaten saveTraining(trainingsdaten trainingsdatenn, Long userid) {
        Optional<User> user = userRepository.findById(userid);

        trainingsdatenn.setUser(user.get());

        return trainingRepository.save(trainingsdatenn);
    }






    public List<trainingDTO> getDatabyId() {
        Optional<User> user = userRepository.findById(1L);
        return trainingRepository.findAllByUser(user)
                .stream()
                .map(trainingsdaten -> new trainingDTO(
                        trainingsdaten.getDate(),
                        trainingsdaten.getKg1(),
                        trainingsdaten.getKg2(),
                        trainingsdaten.getKg3(),
                        trainingsdaten.getKg4(),
                        trainingsdaten.getKg5(),
                        trainingsdaten.getRep1(),
                        trainingsdaten.getRep2(),
                        trainingsdaten.getRep3(),
                        trainingsdaten.getRep4(),
                        trainingsdaten.getRep5(),
                        trainingsdaten.getUb_bezeichnung()

                ))
                .collect(Collectors.toList());

    }

    /*public List<trainingDTO> getDatabyIdAndDate(String date) {
        return trainingRepository.findAllByDate(date)
                .stream()
                .map(trainingsdaten -> new trainingDTO(
                        trainingsdaten.getDate(),
                        trainingsdaten.getKg1(),
                        trainingsdaten.getKg2(),
                        trainingsdaten.getKg3(),
                        trainingsdaten.getKg4(),
                        trainingsdaten.getKg5(),
                        trainingsdaten.getRep1(),
                        trainingsdaten.getRep2(),
                        trainingsdaten.getRep3(),
                        trainingsdaten.getRep4(),
                        trainingsdaten.getRep5(),
                        trainingsdaten.getUb_bezeichnung()

                ))
                .collect(Collectors.toList());

    }*/


    public List<trainingDTO> getallData() {
        return trainingRepository.findAll()
                .stream()
                .map(trainingsdaten -> new trainingDTO(
                        trainingsdaten.getDate(),
                        trainingsdaten.getKg1(),
                        trainingsdaten.getKg2(),
                        trainingsdaten.getKg3(),
                        trainingsdaten.getKg4(),
                        trainingsdaten.getKg5(),
                        trainingsdaten.getRep1(),
                        trainingsdaten.getRep2(),
                        trainingsdaten.getRep3(),
                        trainingsdaten.getRep4(),
                        trainingsdaten.getRep5(),
                        trainingsdaten.getUb_bezeichnung()

                ))
                .collect(Collectors.toList());

    }


}