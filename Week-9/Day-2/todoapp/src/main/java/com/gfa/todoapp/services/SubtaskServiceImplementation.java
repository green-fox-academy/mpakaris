package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Subtask;
import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.repositories.SubtaskRepository;
import com.gfa.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtaskServiceImplementation implements SubtaskService{

    @Autowired
    SubtaskRepository subtaskRepository;
    @Autowired
    TodoRepository todoRepository;

    @Override
    public void createSubtask(Subtask subtask, long mainTaskID) {
    Todo todo = todoRepository.findById(mainTaskID).get();
    List<Subtask> subtaskList = todo.getSubtasks();
    Subtask newSubtask = new Subtask();
    subtaskRepository.save(newSubtask);
    subtask.setId(newSubtask.getId());
    subtask.setMainTask(todo);
    subtaskList.add(subtask);
    todo.setSubtasks(subtaskList);
    subtaskRepository.save(subtask);
    }

    @Override
    public void deleteSubtask(long id) {

    }

    @Override
    public void editSubtask(Subtask subtask) {

    }
}
