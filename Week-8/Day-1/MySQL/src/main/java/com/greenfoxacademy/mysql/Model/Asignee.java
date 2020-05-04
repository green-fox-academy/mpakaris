package com.greenfoxacademy.mysql.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Asignee {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "asignee", cascade = CascadeType.ALL)
    private List<Todo> taskList = null;

    public Asignee() {
        this.taskList = new ArrayList<>();
    }

    public Asignee(String name) {
        this.name = name;
        this.email = name + "@codeMailc.com";
        this.taskList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Todo> taskList) {
        this.taskList = taskList;
    }

    public void addToTaskList(Todo todo) {
        this.taskList.add(todo);
    }

    public void deleteFromTaskList(Todo todo) {
        this.taskList.remove(todo);
    }

}
