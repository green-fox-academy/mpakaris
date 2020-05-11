package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Assignee;
import com.gfa.todoapp.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {

    void createNewAssignee(String name);

    void deleteAssignee(long id);

    void editAssignee(String name, long id);

    List<Todo> tasksOfAssignee(long id);

    List<Assignee> returnAllAssignees();

    Assignee returnAssignee(long id);

    void addTasktoList(Todo todo);

}
