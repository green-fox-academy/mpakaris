package com.greenfoxacademy.webshopdemo.models;

public class Product {

    private String name, description, currency, type, picURL;
    private double price;
    private int quantityStock;
    private boolean inStock = false;
    private boolean currencyState;

    public Product(String name, String type, String description, double price, String currency, int quantityStock, String picURL) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.quantityStock = quantityStock;
        this.currency = currency;
        setCurrencyState();
        if (this.quantityStock > 0) {
            this.inStock = true;
        }
        this.picURL = picURL;
    }

    public boolean setCurrencyState() {
        if(this.currency.equals("HUF")){
            return true;
        } else {
            this.currency = "EUR";
            this.setPrice(350);
            return false;
        }
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public void setCurrencyState(boolean currencyState) {
        this.currencyState = currencyState;
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

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
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
