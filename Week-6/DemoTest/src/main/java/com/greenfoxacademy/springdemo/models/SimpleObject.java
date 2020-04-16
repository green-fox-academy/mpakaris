package com.greenfoxacademy.springdemo.models;

public class SimpleObject {

    private String info;
    private int age;
    private boolean married;

    public SimpleObject(String info) {
        this.info = info;
        this.age = 36;
        this.married = true;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
