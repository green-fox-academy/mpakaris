package com.greenfoxacademy.new_todoapp.Services;

import com.greenfoxacademy.new_todoapp.Models.Task;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface TaskService {


    Task createNewTask(String taskName, String taskDescription, boolean isUrgent, Date dateStart,
                       Date dateDue, long assigneeID);


}
