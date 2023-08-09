package com.example.demo.fitnessAppApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


public record trainingDTO (


    String date, String kg1,String kg2, String kg3, String kg4, String kg5,
    String rep1, String rep2, String rep3, String rep4, String rep5,
    String ub_bezeichnung






)
{
}
