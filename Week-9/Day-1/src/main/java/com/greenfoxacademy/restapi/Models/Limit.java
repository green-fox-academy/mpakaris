package com.greenfoxacademy.restapi.Models;

public class Limit {

    private int until;

    public Limit() {
    }

    public Limit(int until) {

        this.until = until;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}
