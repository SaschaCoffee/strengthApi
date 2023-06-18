package com.example.demo.fitnessAppApi.Repository;

import com.example.demo.fitnessAppApi.entity.trainingsdaten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TrainingRepository extends JpaRepository<trainingsdaten, Long> {
}
