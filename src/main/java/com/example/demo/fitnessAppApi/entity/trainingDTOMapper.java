package com.example.demo.fitnessAppApi.entity;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class trainingDTOMapper implements Function<trainingsdaten, trainingDTO> {
    @Override
    public trainingDTO apply(trainingsdaten trainingsdaten) {
        return new trainingDTO(
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
                trainingsdaten.getUb_bezeichnung());
    }
}
