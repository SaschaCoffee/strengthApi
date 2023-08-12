package com.example.demo.fitnessAppApi.Repository;

import com.example.demo.fitnessAppApi.entity.User;
import com.example.demo.fitnessAppApi.entity.trainingsdaten;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public interface TrainingRepository extends JpaRepository<trainingsdaten, Long> {
    List<trainingsdaten> findAllByUser(final Optional<User> user);

    trainingsdaten findByDate(final String Date);






}
