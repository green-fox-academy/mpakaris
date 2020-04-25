package com.greenfoxacademy.foxclub.Models;

public class Food {

    private String name;
    private String srcImg;

    public Food(String name, String srcImg) {
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

    public void setSrcImg(String hrefCode) {
        this.srcImg = hrefCode;
    }
}
