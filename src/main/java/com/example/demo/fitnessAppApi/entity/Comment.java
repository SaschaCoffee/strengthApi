package com.example.demo.fitnessAppApi.entity;


import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Comment(String comment, User user) {
        this.comment = comment;
        this.user = user;
    }

    public Comment() {

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getBook() {
        return user;
    }

    public void setBook(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
