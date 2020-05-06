package com.gfa.todoapp.controllers;

import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    TodoService todoService;

    @GetMapping({"/", "/main", "/index", "/home"})
    public String renderMainPage(Model model) {
        model.addAttribute("listTodos", todoService.findAllTodo());
        return "main";
    }

    @GetMapping("/newtodo")
    public String addNewTodo(Model model) {
        model.addAttribute("listTodos", todoService.findAllTodo());
        model.addAttribute("newTodo", true);
        model.addAttribute("todo", new Todo());
        return "main";
    }

    @PostMapping("/newtodo")
    public String addNewTodo(@ModelAttribute Todo todo) {
        todoService.createTodo(todo);
        return "redirect:/main";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        model.addAttribute("listTodos", todoService.findAllTodo());
        model.addAttribute("editTodo", true);
        return "main";
    }

    @PostMapping("/edit/{id}")
    public String editTodo(@ModelAttribute Todo todo) {
        todoService.updateTodo(todo);
        return "redirect:/main";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/main";
    }

    @GetMapping("/complete/{id}")
    public String markAsCompleted(@PathVariable long id) {
        todoService.markAsCompleted(id);
        return "redirect:/main";
    }

    










}
