package com.greenfoxacademy.demo.model;

import java.text.DecimalFormat;
import java.util.List;

public class BankAccount {

    private String name, animalType;
    private double balance;
    private boolean isKing, isGood;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;

        if (name.equals("Mufasa")) {
            this.isKing = true;
        } else {
            this.isKing = false;
        }
        if (name.equals("Skar")) {
            this.isGood = false;
        } else {
            this.isGood = true;
        }
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public boolean isKing() {
        return this.isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
       this.balance += amount;
    }
}
