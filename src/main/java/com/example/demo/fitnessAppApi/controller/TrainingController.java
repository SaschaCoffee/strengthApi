package com.example.demo.fitnessAppApi.controller;

import com.example.demo.fitnessAppApi.Repository.TrainingRepository;
import com.example.demo.fitnessAppApi.entity.Trainingdate;
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
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<trainingsdaten> saveTrainingData(@RequestBody trainingsdaten trainingsdaten) {
        System.out.println("HALOOOOOOOOOOOO" + "" + trainingsdaten.getKg1());
       return new ResponseEntity<>(
                //Currently userid is hardcoded. In production
                // the id will be retrieved from the current logged user
                trainingService.saveTraining(trainingsdaten,1L),
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

    @PostMapping("/api/getDatabyIdandDate")
    public ResponseEntity<Trainingdate> findDatabyIdandDate(@RequestBody Trainingdate trainingdate){
        String xx = "hallo";
        System.out.print("HALLO11" +trainingdate.getDate());
       return new ResponseEntity<>(
               trainingdate, HttpStatus.CREATED
       );
    }

    @PostMapping("/api/testemich")
    public ResponseEntity<trainingsdaten> findData2(@RequestBody trainingsdaten trainingsdatenTwo) {
        //trainingsdatenTwo.getDate is not working. Workaround : getkg1
        System.out.println("HALOOOOOOOOOOOO33" + "" + trainingsdatenTwo.getKg1());
        return new ResponseEntity<>(
                //Currently userid is hardcoded. In production
                // the id will be retrieved from the current logged user
                trainingRepository.findByDate(trainingsdatenTwo.getKg1()),
                HttpStatus.CREATED);
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
