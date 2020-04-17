package com.greenfoxacademy.webshopdemo.models;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class WebShop {

    private List<Product> webShopContent;

    public WebShop() {
        this.webShopContent = new ArrayList<>();
        fill();
    }

    public void fill() {
        webShopContent.add(new Product("Running Shoes", "Nike running Shoes for every day sport", 10000, 5));
        webShopContent.add(new Product("Printer", "HP Printer Nike that will print pages", 3000, 2));
        webShopContent.add(new Product("Coca Cola", "standard Coke of 0.5 liter", 25, 0));
        webShopContent.add( new Product("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        webShopContent.add(new Product("T-Shirt", "Blue with print of a corgi on a bike", 300, 1));
    }

    public List<Product> getWebShopContent() {
        return webShopContent;
    }

    public void addItemToWebShop(Product itemToAdd) {
        this.webShopContent.add(itemToAdd);
    }

    public List<Product> getAvailavleItems() {
        return webShopContent
                .stream()
                .filter(item -> item.isInStock())
                .collect(Collectors.toList());
    }

    public List<Product> getCheapest() {
        return webShopContent
                .stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    public List<Product> getContainsNike() {
        return webShopContent
                .stream()
                .filter(item -> item.getName().contains("Nike") || item.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }

    public OptionalDouble getAverageStock() {
        return webShopContent
                .stream()
                .mapToInt(item -> item.getQuantityStock())
                .average();
    }

    public List<Product> getMostExpensiveItem () {
        return webShopContent
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getResultOfSearchQuery(String searchQuery) {
        return webShopContent
                .stream()
                .filter(item -> item.getName().toLowerCase().contains(searchQuery.toLowerCase()) || item.getDescription().toLowerCase().contains(searchQuery.toLowerCase()))
                .collect(Collectors.toList());
   }





}
