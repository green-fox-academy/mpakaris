package com.greenfoxacademy.new_todoapp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


public class Subtask {


    private long id;
    private String subtaskName;
    private Date dateCreated;
    private Date dateDue;
    private boolean isPriority;
    private boolean isDone;

    private Assignee assignee;

    public Subtask() {
    }
}
