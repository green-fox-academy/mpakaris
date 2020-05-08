package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    Todo createTodo(Todo todo);

    void updateTodo(Todo todo);

    void markAsCompleted(long id);

    void reopenTask(long id);

    void deleteTodo(long id);

    List<Todo> findAllTodo();

    Todo findTodoById(long id);




}
