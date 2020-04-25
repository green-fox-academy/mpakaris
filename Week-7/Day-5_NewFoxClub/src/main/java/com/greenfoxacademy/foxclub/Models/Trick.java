package com.greenfoxacademy.foxclub.Models;

public class Trick {

    private String name;
    private int level;
    private String imgUrl;

    public Trick(String name, String imgUrl, int level) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.level = level;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

        public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }

    public String getImgUrl() {

        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {

        this.imgUrl = imgUrl;
    }
}
