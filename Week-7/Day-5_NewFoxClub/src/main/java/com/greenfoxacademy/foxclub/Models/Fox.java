package com.greenfoxacademy.foxclub.Models;

import com.greenfoxacademy.foxclub.Services.FoodService;
import com.sun.jdi.request.MonitorWaitedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Fox {

    private FoodService foodService;

    private String name;
    private String food, foodUrl;
    private String drink, drinkUrl;
    private String trick, trickUrl;
    private List<String> listOFTricks;

    @Autowired
    public Fox (FoodService foodService) {
        this.foodService = foodService;
    }

    public Fox(String name) {
        this.name = name;
        this.food = "Italian";
        this.foodUrl = "italian.jpg";
        this.drink = "Water";
        this.drinkUrl = "water.jpg";
        this.listOFTricks = new ArrayList<>();
        this.listOFTricks.add("Be green");
        this.trick = "Be weird";
        this.trickUrl = "curious.jpg";
    }
    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getTrickUrl() {
        return trickUrl;
    }

    public void setTrickUrl(String trickUrl) {
        this.trickUrl = trickUrl;
    }

    public String getFoodUrl() {
        return foodUrl;
    }

    public void setFoodUrl(String foodUrlNew) {
       this.foodUrl = foodUrlNew;
    }

    public String getDrinkUrl() {
        return drinkUrl;
    }

    public void setDrinkUrl(String drinkUrlNew) {
        this.drinkUrl = drinkUrlNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
        setDrinkUrl(this.drink);
    }

    public List<String> getListOFTricks() {
        return listOFTricks;
    }

    public void setListOFTricks(List<String> listOFTricks) {
        this.listOFTricks = listOFTricks;
    }
}
