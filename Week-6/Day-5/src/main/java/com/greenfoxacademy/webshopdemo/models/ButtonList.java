package com.greenfoxacademy.webshopdemo.models;

import java.util.ArrayList;
import java.util.List;

public class ButtonList {

    List<Button> listOfButtons;

    public ButtonList() {
        this.listOfButtons = new ArrayList<>();
        fill();
    }

    public void fill() {
        listOfButtons.add(new Button("Prices in EUR", "/setEURPrices"));
        listOfButtons.add(new Button("Prices in HUF", "/setHUFPrices"));
        listOfButtons.add(new Button("Available", "/available"));
        listOfButtons.add(new Button("Cheapest First", "/cheapest"));
        listOfButtons.add(new Button("Contains 'Nike", "/containsNike"));
        listOfButtons.add(new Button("Average Stock", "/averageStock"));
        listOfButtons.add(new Button("Most Expensive", "/mostExpensiveProduct"));
        listOfButtons.add(new Button("Add Item", "/addItem"));
        listOfButtons.add(new Button("Delete Item", "/deleteItem"));
    }

    public List<Button> getListOfButtons() {
        return listOfButtons;
    }

    public void setListOfButtons(Button button) {
        this.listOfButtons.add(button);
    }
}
