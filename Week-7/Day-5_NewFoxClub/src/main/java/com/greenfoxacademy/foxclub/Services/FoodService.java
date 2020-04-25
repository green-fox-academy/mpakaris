package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.Models.Drink;
import com.greenfoxacademy.foxclub.Models.Food;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoodService {

    private List<Food> listOfFoods = null;
    private List<Drink> listOfDrinks = null;

    public FoodService() {
        this.listOfFoods = new ArrayList<>();
        this.listOfFoods.add(new Food("Italian", "italian.jpg"));
        this.listOfFoods.add(new Food("Greek", "greek.jpg"));
        this.listOfFoods.add(new Food("Chinese", "chinese.jpg"));
        this.listOfFoods.add(new Food("French", "french.jpg"));
        this.listOfFoods.add(new Food("Junk", "junk.jpg"));
        this.listOfFoods.add(new Food("Vegetarian", "vegetarian.jpg"));

        this.listOfDrinks = new ArrayList<>();
        this.listOfDrinks.add(new Drink("Soft Drinks", "soft.jpg"));
        this.listOfDrinks.add(new Drink("Water", "water.jpg"));
        this.listOfDrinks.add(new Drink("Alcoholic", "alc.jpg"));
        this.listOfDrinks.add(new Drink("Milkshakes", "milk.jpg"));
        this.listOfDrinks.add(new Drink("Smoothies", "smooth.jpg"));
        this.listOfDrinks.add(new Drink("Energy Drinks", "energy.jpg"));
        this.listOfDrinks.add(new Drink("Coffeine", "coffee.jpg"));
    }

    public List<Food> getListOfFoods() {
        return listOfFoods;
    }

    public void setListOfFoods(List<Food> listOfFoods) {
        this.listOfFoods = listOfFoods;
    }

    public List<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public void setListOfDrinks(List<Drink> listOfDrinks) {
        this.listOfDrinks = listOfDrinks;
    }


}
