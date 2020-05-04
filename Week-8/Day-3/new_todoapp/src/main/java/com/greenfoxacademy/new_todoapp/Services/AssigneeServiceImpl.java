package com.greenfoxacademy.new_todoapp.Services;

import com.greenfoxacademy.new_todoapp.Models.Assignee;
import com.greenfoxacademy.new_todoapp.Repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private AssigneeRepository assigneeRepository;

    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public Assignee createNewAssignee(String userName, String userEmail) {

        Assignee assignee = new Assignee(userName, userEmail);
        assigneeRepository.save(assignee);

        return assignee;
    }

    @Override
    public Assignee findAssigneeByID(long id) {
        return assigneeRepository.findById(id).get();
    }
}
