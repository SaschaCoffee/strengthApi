package com.example.demo.fitnessAppApi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"date", "user_id"})
})
public class trainingsdaten {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String ub_bezeichnung;


    private String date;

    String rep1, rep2, rep3, rep4, rep5, kg1, kg2, kg3, kg4, kg5;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
