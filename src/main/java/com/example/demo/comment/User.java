package com.example.demo.comment;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String name;

    //relation with comment
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true,
            mappedBy = "user")
    private Set<comment> comments;

    public User(String name, Set<comment> comments) {
        this.name = name;
        this.comments = comments;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<comment> getComments() {
        return comments;
    }

    public void setComments(Set<comment> comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }
}
