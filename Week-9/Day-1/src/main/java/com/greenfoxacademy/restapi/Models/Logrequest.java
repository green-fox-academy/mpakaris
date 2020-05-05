package com.greenfoxacademy.restapi.Models;

public class Logrequest {

    private int count;
    private int page;

    public Logrequest(int count, int page) {
        this.count = count;
        this.page = page;
    }

    public Logrequest() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
