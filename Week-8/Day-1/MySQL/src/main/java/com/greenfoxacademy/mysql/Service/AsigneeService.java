package com.greenfoxacademy.mysql.Service;

import com.greenfoxacademy.mysql.Model.Asignee;
import com.greenfoxacademy.mysql.Model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AsigneeService {

    void addTaskToAsignee(Todo todo);

    List<Asignee> getAllAsignees();

    Asignee getAsigneeById(long id);

}
