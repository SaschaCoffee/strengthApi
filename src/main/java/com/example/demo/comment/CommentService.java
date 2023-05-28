package com.example.demo.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;
    public comment userPostComment(comment comment, Long userId){


            Optional<User> user = userRepository.findById(1L);
            /**
             set other attributes
             **/
            //add found user to the comment

            comment.setUser(user.get());
            return commentRepository.save(comment);




    }

}
