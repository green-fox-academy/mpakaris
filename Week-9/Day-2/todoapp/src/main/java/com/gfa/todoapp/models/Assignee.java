package com.gfa.todoapp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String assigneeName;

    @Temporal(value = TemporalType.DATE)
    private Date date;

    @OneToMany ()
    private List<Todo> listTodos;

    @OneToMany ()
    private List<Subtask> listSubtasks;

    public Assignee() {
    }

    public Assignee(String name) {
        this.assigneeName = name;
        this.listTodos = new ArrayList<>();
        this.listSubtasks = new ArrayList<>();
        this.date = new Date();
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

    public List<Todo> getListTodos() {return listTodos; }

    public void setListTodos(List<Todo> listTodos) {
        this.listTodos = listTodos;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addTodo(Todo todo) {
        this.listTodos.add(todo);
    }

    public List<Subtask> getListSubtasks() {
        return listSubtasks;
    }

    public void setListSubtasks(List<Subtask> listSubtasks) {
        this.listSubtasks = listSubtasks;
    }
}
