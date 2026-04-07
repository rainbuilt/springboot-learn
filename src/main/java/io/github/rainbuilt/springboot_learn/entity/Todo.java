package io.github.rainbuilt.springboot_learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean done;

    protected Todo() {}
    public Todo(String title) {
        this.title = title;
        this.done = false;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isDone() { return done; }
}
