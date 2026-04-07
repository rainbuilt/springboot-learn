package io.github.rainbuilt.springboot_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.rainbuilt.springboot_learn.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
