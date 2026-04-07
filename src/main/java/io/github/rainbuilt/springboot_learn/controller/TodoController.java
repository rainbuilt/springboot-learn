package io.github.rainbuilt.springboot_learn.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.rainbuilt.springboot_learn.dto.TodoCreateRequest;
import io.github.rainbuilt.springboot_learn.entity.Todo;
import io.github.rainbuilt.springboot_learn.service.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @PostMapping
    public Todo create(@Valid @RequestBody TodoCreateRequest request) {
        return todoService.create(request.title());
    }
}