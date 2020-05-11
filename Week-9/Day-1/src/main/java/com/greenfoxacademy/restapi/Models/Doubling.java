package com.greenfoxacademy.restapi.Models;

import com.greenfoxacademy.restapi.Services.LogService;
import org.springframework.beans.factory.annotation.Autowired;

public class Doubling {

    private int received;
    private int result;

    public Doubling(int received) {
        this.received = received;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
