package com.greenfoxacademy.mysql.Service;

import com.greenfoxacademy.mysql.Model.Asignee;
import com.greenfoxacademy.mysql.Model.Todo;
import com.greenfoxacademy.mysql.Repository.AsigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AsigneeServiceImplementation implements AsigneeService{

   private AsigneeRepository asigneeRepository;

    public AsigneeServiceImplementation(AsigneeRepository asigneeRepository) {
        this.asigneeRepository = asigneeRepository;
    }

    @Autowired
    public AsigneeServiceImplementation(TodoService todoService, AsigneeRepository asigneeRepository) {
        this.asigneeRepository = asigneeRepository;
    }

    @Override
    public void addTaskToAsignee(Todo todo) {

    }

    @Override
    public List<Asignee> getAllAsignees() {
        List<Asignee> listAsignees = new ArrayList<>();
        asigneeRepository.findAll().forEach(listAsignees::add);
        return listAsignees;
    }

    @Override
    public Asignee getAsigneeById(long id) {
        return asigneeRepository.findById(id).orElse(new Asignee("none"));
    }
}
