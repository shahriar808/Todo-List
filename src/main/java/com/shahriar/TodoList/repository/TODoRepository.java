package com.shahriar.TodoList.repository;

import com.shahriar.TodoList.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TODoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findByCompleted(boolean completed);

}
