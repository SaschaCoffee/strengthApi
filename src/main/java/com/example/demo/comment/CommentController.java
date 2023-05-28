package com.example.demo.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/api/addcomment")
    public ResponseEntity<comment> addComment(@RequestBody comment comment){
        return new ResponseEntity<>(
                commentService.userPostComment(comment, 1L),
                HttpStatus.CREATED);





     /*   return new ResponseEntity<>(
                commentService.userPostComment(comment, id),
                HttpStatus.CREATED);*/
    }
}
