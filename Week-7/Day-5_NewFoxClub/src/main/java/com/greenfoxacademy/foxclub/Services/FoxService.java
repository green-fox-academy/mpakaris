package com.greenfoxacademy.foxclub.Services;

import com.greenfoxacademy.foxclub.Models.Drink;
import com.greenfoxacademy.foxclub.Models.Food;
import com.greenfoxacademy.foxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> listOfFoxes;
    private FoodService foodService;
    private TrickService trickService;

    public FoxService(FoodService foodService, TrickService trickService) {
        this.listOfFoxes = new ArrayList<>();
        this.foodService = foodService;
        this.trickService = new TrickService();
    }

    public void initServices() {

        this.listOfFoxes.add(new Fox("Laci"));
        this.listOfFoxes.add(new Fox("Berci"));
        this.listOfFoxes.add(new Fox("Kolbasz"));
    }

    public Fox getLaci() {
        Fox fox = new Fox("Laci");
        this.listOfFoxes.add(fox);
        return fox;
    }

    public Fox getBerci() {
        Fox fox = new Fox("Berci");
        this.listOfFoxes.add(fox);
        return fox;
    }

    public Fox getKolbasz() {
        Fox fox = new Fox("Kolbasz");
        this.listOfFoxes.add(fox);
        return fox;
    }

    public void createNewFox(String nameOfNewFox) {
        this.listOfFoxes.add(new Fox(nameOfNewFox));
    }

    public Fox getFox(String nameOfFox) {
        Fox fox = null;
        for (Fox f : this.listOfFoxes) {
            if (f.getName().equals(nameOfFox)) {
                fox = f;
            }
        }
        return fox;
    }

    public void changeNutrition(String newItem, String nameFox) {
        for (int i = 0; i < listOfFoxes.size(); i++) {
            if (listOfFoxes.get(i).getName().equals(nameFox)) {
                for (int j = 0; j < foodService.getListOfFoods().size(); j++) {
                    String foodInList = foodService.getListOfFoods().get(j).getName();
                    if (foodInList.equals(newItem)) {
                        listOfFoxes.get(i).setFood(newItem);
                        listOfFoxes.get(i).setFoodUrl(foodService.getListOfFoods().get(j).getSrcImg());
                        break;
                    }
                }
                for (int j = 0; j < foodService.getListOfDrinks().size(); j++) {
                    String drinkInList = foodService.getListOfDrinks().get(j).getName();
                    if (drinkInList.equals(newItem)) {
                        listOfFoxes.get(i).setDrink(newItem);
                        listOfFoxes.get(i).setDrinkUrl(foodService.getListOfDrinks().get(j).getSrcImg());
                        break;
                    }
                }

            }
        }
    }

    public void changeTrick(String newTrick, String nameFox) {
        for (int i = 0; i < listOfFoxes.size(); i++) {
            if (listOfFoxes.get(i).getName().equals(nameFox)) {
                for (int j = 0; j < trickService.getTrickList().size(); j++) {
                    String trickInList = trickService.getTrickList().get(j).getName();
                    if (trickInList.equals(newTrick)) {
                        listOfFoxes.get(i).setTrick(newTrick);
                        listOfFoxes.get(i).setTrickUrl(trickService.getTrickList().get(j).getImgUrl());
                        break;
                    }
                }
            }
        }
    }
}