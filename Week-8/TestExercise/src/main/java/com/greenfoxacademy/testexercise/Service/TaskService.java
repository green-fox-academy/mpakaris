package com.greenfoxacademy.testexercise.Service;

import com.greenfoxacademy.testexercise.Models.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public interface TaskService {

    Task createNewTask(Task task);


}
