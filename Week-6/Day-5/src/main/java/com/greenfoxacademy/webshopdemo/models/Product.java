package com.greenfoxacademy.webshopdemo.models;

import java.util.List;

public class Product {

    private String name, description, currency;
    private int price, quantityStock;
    private boolean inStock = false;

    public Product(String name, String description, int price, int quantityStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityStock = quantityStock;
        this.currency = "HUF";
        if (this.quantityStock > 0) {
            this.inStock = true;
        }
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int qauntityStock) {
        this.quantityStock = qauntityStock;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


}
