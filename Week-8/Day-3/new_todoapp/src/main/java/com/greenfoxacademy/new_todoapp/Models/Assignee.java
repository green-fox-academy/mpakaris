package com.greenfoxacademy.new_todoapp.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String assigneeName;
    private String assigneeEmail;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn
    private List<Task> assigneeTasks;

    // private List<Subtask> assigneeSubtasks;

    public Assignee() {
        this.assigneeTasks = new ArrayList<>();
    }

    public Assignee(String name, String email) {
        this.assigneeName = name;
        this.assigneeEmail = email;
        this.assigneeTasks = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getAssigneeEmail() {
        return assigneeEmail;
    }

    public void setAssigneeEmail(String assigneeEmail) {
        this.assigneeEmail = assigneeEmail;
    }

    public List<Task> getAssigneeTasks() {
        return assigneeTasks;
    }

    public void setAssigneeTasks(List<Task> assigneeTasks) {
        this.assigneeTasks = assigneeTasks;
    }
}
