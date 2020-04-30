package com.greenfoxacademy.mysql.Service;

import com.greenfoxacademy.mysql.Model.Asignee;
import com.greenfoxacademy.mysql.Model.Todo;
import com.greenfoxacademy.mysql.Repository.AsigneeRepository;
import com.greenfoxacademy.mysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository
public class TodoServiceImplementation implements TodoService {

   private TodoRepository todoRepository;
   private AsigneeRepository asigneeRepository;

    public TodoServiceImplementation(TodoRepository todoRepository, AsigneeRepository asigneeRepository) {
        this.todoRepository = todoRepository;
        this.asigneeRepository = asigneeRepository;
    }

    @Override
    public List<Todo> listTasks(String active) {
        List<Todo> result = StreamSupport
                .stream(todoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        //open Tasks
        if (active.equals("true")) {
            return result.stream()
                    .filter(p -> p.isDone() == false)
                    .collect(Collectors.toList());
            //All tasks
        } else {
            return result;
        }
    }

    @Override
    public void addTask(String task, String urgent, long id) {
        Asignee asigneeNew = new Asignee();
        asigneeNew = asigneeRepository.findById(id).get();
        if (urgent.equals("urgent")) {
            todoRepository.save(new Todo(task, true, false, asigneeNew));
        } else {
            todoRepository.save(new Todo(task, false, false, asigneeNew));
        }
    }

    @Override
    public void deleteTask(Long id) {

        todoRepository.deleteById(id);
    }

    @Override
    public Todo fetchTaskToEdit(Long id) {
        return todoRepository.findById(id).orElse(new Todo("No Todo-Task found", false, false));
    }

    @Override
    public void editTask(long idTask, String task, boolean urgent, boolean done, long idAsignee) {
        //Get Task to Edit:
        Todo taskToEdit = todoRepository.findById(idTask).get();

        //Get Asignee that was assigned via Frontend:
        Asignee asignee = asigneeRepository.findById(idAsignee).get();

        //Update Information of Task:
        taskToEdit.setUrgent(urgent);
        taskToEdit.setDone(done);
        taskToEdit.setTask(task);
        taskToEdit.setAsignee(asignee);
        todoRepository.save(taskToEdit);
    }

    @Override
    public List<Todo> searchTask(String searchQuery) {
        List<Todo> streamedList = StreamSupport
                .stream(todoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        List<Todo> result = new ArrayList<>();
        for (Todo task : streamedList) {
            if (task.getTask().toLowerCase().contains(searchQuery.toLowerCase())) {
                result.add(task);
            }
        }
        return result;
    }

}
