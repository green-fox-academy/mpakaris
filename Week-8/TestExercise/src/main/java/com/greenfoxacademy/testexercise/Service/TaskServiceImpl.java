package com.greenfoxacademy.testexercise.Service;

import com.greenfoxacademy.testexercise.Models.Task;
import com.greenfoxacademy.testexercise.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createNewTask(Task task) {
        Task taskNEW = task;
        taskRepository.save(taskNEW);
        return taskNEW;
    }


}
