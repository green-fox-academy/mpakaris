package com.greenfoxacademy.foxclub.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

    private String name;
    private List<String> tricks = Arrays.asList("Backflip", "Be Green", "Read fast");
    private List<String> food = Arrays.asList("Onion Rings", "Chips", "Fries");
    private List<String> drink = Arrays.asList("Whiskey", "Limonade", "Water");
    private String currentFood;
    private String currentDrink;

    public Fox(String name) {
        this.name = name;
        this.currentFood = food.get(0);
        this.currentDrink = drink.get(0);
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(String currentFood) {
        this.currentFood = currentFood;
    }

    public String getCurrentDrink() {
        return currentDrink;
    }

    public void setCurrentDrink(String currentDrink) {
        this.currentDrink = currentDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(String trick) {
        this.tricks.add(trick);
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public List<String> getDrink() {
        return drink;
    }

    public void setDrink(List<String> drink) {
        this.drink = drink;
    }
}
