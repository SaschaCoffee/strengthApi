package com.example.demo.fitnessAppApi.controller;

import com.example.demo.fitnessAppApi.Repository.TrainingRepository;
import com.example.demo.fitnessAppApi.entity.trainingDTO;
import com.example.demo.fitnessAppApi.service.CommentService;
import com.example.demo.fitnessAppApi.entity.Comment;
import com.example.demo.fitnessAppApi.entity.trainingsdaten;
import com.example.demo.fitnessAppApi.service.TrainingService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TrainingController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private TrainingService trainingService;

    @Autowired
    private TrainingRepository trainingRepository;

    @PostMapping("/api/trainingsdaten")
    public ResponseEntity<trainingsdaten> addComment(@RequestBody trainingsdaten trainingsdaten) {

       return new ResponseEntity<>(
                //Currently userid is hardcoded. In production
                // the id will be retrieved from the current logged user
                trainingService.saveTraining(trainingsdaten,2L),
                HttpStatus.CREATED);
    }

    @GetMapping("/api/getAlltrainingData")
    public List<trainingDTO> findAllOrders(){
        return trainingService.getallData();
    }

    //Below it only shows data of specific user

    @GetMapping("/api/getDatabyId")
    public List<trainingDTO> findDatabyId(){
        return trainingService.getDatabyId();
    }

    //test method
    @PostMapping("/api/addcomment")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        return new ResponseEntity<>(
                commentService.userPostComment(comment, 1L),
                HttpStatus.CREATED);

     /*   return new ResponseEntity<>(
                commentService.userPostComment(comment, id),
                HttpStatus.CREATED);*/
    }



}
