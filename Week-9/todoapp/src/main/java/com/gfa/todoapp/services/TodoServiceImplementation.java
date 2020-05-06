package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImplementation implements TodoService{

    @Autowired
    TodoRepository todoRepository;

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        Todo todoFromDB = todoRepository.findById(todo.getId()).get();
        todoFromDB.setTaskName(todo.getTaskName());
        todoRepository.save(todoFromDB);
    }

    @Override
    public void markAsCompleted(long id) {
        Todo todo = todoRepository.findById(id).get();
        todo.setCompleted(true);
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> findAllTodo() {
        List<Todo> allTodos = new ArrayList<>();
        todoRepository.findAll().forEach(allTodos::add);
        return allTodos;
    }

    @Override
    public Todo findTodoById(long id) {
        return todoRepository.findById(id).get();
    }
}
