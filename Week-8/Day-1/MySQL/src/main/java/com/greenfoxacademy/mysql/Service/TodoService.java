package com.greenfoxacademy.mysql.Service;

import com.greenfoxacademy.mysql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    List<Todo> listTasks(String active);

    void addTask(String task, String urgent, long id);

    void deleteTask(Long id);

    Todo fetchTaskToEdit(Long id);

    void editTask(long idTask, String task, boolean urgent, boolean done, long idAsignee);

    List<Todo> searchTask(String searchQuery);
}
