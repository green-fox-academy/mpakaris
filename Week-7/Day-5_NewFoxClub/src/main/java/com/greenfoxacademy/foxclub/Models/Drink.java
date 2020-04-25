package com.greenfoxacademy.foxclub.Models;

public class Drink {

    private String name;
    private String srcImg;

    public Drink(String name, String srcImg) {
        this.name = name;
        this.srcImg = srcImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrcImg() {
        return srcImg;
    }

    public void setSrcImg(String srcImg) {
        this.srcImg = srcImg;
    }
}
