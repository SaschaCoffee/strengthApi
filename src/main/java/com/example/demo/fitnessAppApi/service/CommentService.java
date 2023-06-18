package com.example.demo.fitnessAppApi.service;

import com.example.demo.fitnessAppApi.Repository.CommentRepository;
import com.example.demo.fitnessAppApi.Repository.UserRepository;
import com.example.demo.fitnessAppApi.entity.User;
import com.example.demo.fitnessAppApi.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;
    public Comment userPostComment(Comment comment, Long userId){


            Optional<User> user = userRepository.findById(1L);
            /**
             set other attributes
             **/
            //add found user to the comment

            comment.setUser(user.get());
            return commentRepository.save(comment);




    }

}
