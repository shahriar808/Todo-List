package com.shahriar.TodoList.service;

import com.shahriar.TodoList.entity.ToDo;
import com.shahriar.TodoList.repository.TODoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private TODoRepository todoRepository;

    public List<ToDo> findAllTasks() {
        return todoRepository.findAll();
    }

    public ToDo findById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    public void save(ToDo todo) {
        todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        ToDo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        todoRepository.delete(todo);
    }
    public List<ToDo> findCompletedTasks() {
        return todoRepository.findByCompleted(true);
    }

    public List<ToDo> findRemainingTasks() {
        return todoRepository.findByCompleted(false);
    }

}
