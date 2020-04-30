package com.greenfoxacademy.mysql.Model;

import org.hibernate.annotations.Generated;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Todo {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String task;
    private boolean urgent;
    private boolean done;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Asignee asignee;

    public Todo() {
    };

    public Todo(String task, boolean urgent, boolean done) {
        this.task = task;
        this.urgent = urgent;
        this.done = done;
    }

    public Todo(String task, boolean urgent, boolean done, Asignee asignee) {
        this.task = task;
        this.urgent = urgent;
        this.done = done;
        this.asignee = asignee;
    }

    /* private void assignFirstTimeAssignee() {
        this.asignee = new Asignee("none", "");
    } */

    public void setId(long id) {
        id = id;
    }

    public long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Asignee getAsignee() {
        return asignee;
    }

    public void setAsignee(Asignee asignee) {
        this.asignee = asignee;
    }
}
