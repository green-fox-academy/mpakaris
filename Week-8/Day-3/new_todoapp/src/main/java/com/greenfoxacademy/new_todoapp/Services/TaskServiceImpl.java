package com.greenfoxacademy.new_todoapp.Services;

import com.greenfoxacademy.new_todoapp.Models.Assignee;
import com.greenfoxacademy.new_todoapp.Models.Task;
import com.greenfoxacademy.new_todoapp.Repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskServiceImpl implements TaskService {

    private AssigneeService assigneeService;
    private TaskRepository taskRepository;

    public TaskServiceImpl(AssigneeService assigneeService, TaskRepository taskRepository) {
        this.assigneeService = assigneeService;
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createNewTask(String taskName, String taskDescription, boolean isUrgent,
                              Date dateStart, Date dateDue, long assigneeID) {
        Assignee assignee = assigneeService.findAssigneeByID(assigneeID);
        Task newTask = new Task(taskName, taskDescription, isUrgent, dateStart, dateDue, assignee);
        taskRepository.save(newTask);
        return newTask;
    }
}
