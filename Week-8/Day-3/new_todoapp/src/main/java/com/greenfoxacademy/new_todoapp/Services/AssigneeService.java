package com.greenfoxacademy.new_todoapp.Services;

import com.greenfoxacademy.new_todoapp.Models.Assignee;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {

    Assignee createNewAssignee(String userName, String userEmail);

    Assignee findAssigneeByID(long id);

}
