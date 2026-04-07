package io.github.rainbuilt.springboot_learn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.rainbuilt.springboot_learn.entity.Todo;
import io.github.rainbuilt.springboot_learn.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(String title) {
        Todo todo = new Todo(title);
        return todoRepository.save(todo);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}