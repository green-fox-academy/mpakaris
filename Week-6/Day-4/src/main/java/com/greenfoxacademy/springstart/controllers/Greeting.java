package com.greenfoxacademy.springstart.controllers;

public class Greeting<Atomiclong> {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        this.setId();
        return id-1;
    }

    public void setId() {
        this.id++;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
