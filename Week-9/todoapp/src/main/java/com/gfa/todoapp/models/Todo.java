package com.gfa.todoapp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String taskName;
    private boolean isCompleted;

    @Temporal( value = TemporalType.DATE)
    private Date dateCreated;

    @Temporal( value = TemporalType.DATE)
    private Date dateDue;

    public Todo() {
    }

    public Todo(String taskName) {
        this.taskName = taskName;
        this.dateCreated = new Date();
        this.isCompleted = false;
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
}
