package com.greenfoxacademy.foxclub.Models;

import java.sql.Date;

public class Action {

    private Date date;
    private String action;
    private String wholeInfo;

    public Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getWholeInfo() {
        return wholeInfo;
    }

    public void setWholeInfo(String wholeInfo) {
        this.wholeInfo = wholeInfo;
    }
}
