package com.greenfoxacademy.restapi.Models;

import java.util.List;

public class AllLogs {

    private List<Log> logs;
    private int entry_count;

    public AllLogs(List<Log> logs) {
        this.logs = logs;
        this.entry_count = logs.size();
    }

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }
}
