package com.gfa.todoapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String taskName;
    private boolean isCompleted;

    @Temporal( value = TemporalType.DATE)
    private Date dateCreated;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal( value = TemporalType.DATE)
    private Date dateDue;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Assignee taskAssignee;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Subtask> subtasks;

    public Todo() {
    }

    public Todo(String taskName, Assignee assignee) {
        this.taskName = taskName;
        this.dateCreated = new Date();
        this.isCompleted = false;
        if (assignee == null) {
            this.taskAssignee = new Assignee("none");
        } else {
            this.taskAssignee = assignee;
        }
        this.subtasks = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public Assignee getTaskAssignee() {
        return taskAssignee;
    }

    public void setTaskAssignee(Assignee taskAssignee) {
        this.taskAssignee = taskAssignee;
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Subtask> subtasks) {
        this.subtasks = subtasks;
    }
}
