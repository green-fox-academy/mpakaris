package com.gfa.todoapp.models;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
public class Subtask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String subtaskName;

    @ManyToOne()
    @JoinColumn
    private Assignee subtaskAssignee;

    @ManyToOne()
    @JoinColumn
    private Todo mainTask;

    public Subtask() {
    }

    public Subtask(String name, Todo  mainTodo, Assignee subtaskAssignee) {
        this.subtaskName = name;
        this.mainTask = mainTodo;
        this.subtaskAssignee = subtaskAssignee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public Todo getMainTask() {
        return mainTask;
    }

    public void setMainTask(Todo mainTask) {
        this.mainTask = mainTask;
    }

    public Assignee getSubtaskAssignee() {
        return subtaskAssignee;
    }

    public void setSubtaskAssignee(Assignee subtaskAssignee) {
        this.subtaskAssignee = subtaskAssignee;
    }
}
