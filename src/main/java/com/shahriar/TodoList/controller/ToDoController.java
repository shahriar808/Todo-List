package com.shahriar.TodoList.controller;

import com.shahriar.TodoList.entity.ToDo;
import com.shahriar.TodoList.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public String showAllTasks(Model model) {
        List<ToDo> todo = toDoService.findAllTasks();
        model.addAttribute("todo", todo);
        return "tasks";
    }

    @GetMapping("/{id}")
    public String showTaskById(@PathVariable Long id, Model model) {
        ToDo todo = toDoService.findById(id);
        model.addAttribute("todo", todo);
        return "list-task";
    }

    @GetMapping("/edit/{id}")
    public String showEditTaskForm(@PathVariable Long id, Model model) {
        ToDo todo = toDoService.findById(id);
        model.addAttribute("todo", todo);
        return "edit-task";
    }

    @PostMapping("/save-update")
    public String saveOrUpdateTask(@ModelAttribute("todo") ToDo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "edit-task";
        }
        toDoService.save(todo);
        return "redirect:/tasks";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("todo") ToDo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "add-task";
        }
        toDoService.save(todo);
        return "redirect:/tasks";
    }

    @GetMapping("/add")
    public String showAddTaskForm(Model model) {
        model.addAttribute("todo", new ToDo());
        return "add-task";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        toDoService.deleteById(id);
        return "redirect:/tasks";
    }
    @GetMapping("/completed")
    public String showCompletedTasks(Model model) {
        List<ToDo> completedTasks = toDoService.findCompletedTasks();
        model.addAttribute("todo", completedTasks);
        return "completed-tasks";
    }

    @GetMapping("/remaining")
    public String showRemainingTasks(Model model) {
        List<ToDo> remainingTasks = toDoService.findRemainingTasks();
        model.addAttribute("todo", remainingTasks);
        return "remaining-tasks";
    }

}
