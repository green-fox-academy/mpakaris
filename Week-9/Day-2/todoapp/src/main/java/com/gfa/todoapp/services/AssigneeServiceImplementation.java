package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Assignee;
import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Assign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssigneeServiceImplementation implements AssigneeService {

    @Autowired
    AssigneeRepository assigneeRepository;

    @Override
    public void createNewAssignee(String name) {
        Assignee assignee = new Assignee(name);
        assigneeRepository.save(assignee);
    }

    @Override
    public void deleteAssignee(long id) {
        assigneeRepository.deleteById(id);
    }

    @Override
    public void editAssignee(String name, long id) {
        Assignee assigneeDB = assigneeRepository.findById(id).get();
        assigneeDB.setAssigneeName(name);
        assigneeRepository.save(assigneeDB);
    }

    @Override
    public List<Todo> tasksOfAssignee(long id) {
        Assignee assignee = assigneeRepository.findById(id).get();
        return assignee.getListTodos();
    }

    @Override
    public List<Assignee> returnAllAssignees() {
        List<Assignee> listAllAssignees = new ArrayList<>();
        assigneeRepository.findAll().forEach(listAllAssignees::add);
        return listAllAssignees;
    }

    @Override
    public Assignee returnAssignee(long id) {
        return assigneeRepository.findById(id).get();
    }

    @Override
    public void addTasktoList(Todo todo) {
        Assignee assignee = assigneeRepository.findById(todo.getTaskAssignee().getId()).get();
        List<Todo> allTasksOfAssignee = assignee.getListTodos();
        allTasksOfAssignee.add(todo);
        assignee.setListTodos(allTasksOfAssignee);
        assigneeRepository.save(assignee);
    }
}
