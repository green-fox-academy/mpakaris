package com.greenfoxacademy.restapi.Models;

public class DoItUntilFactor {
    private int result;

    public DoItUntilFactor(int limit) {
       this.result = 1;

        for (int i = 1; i <= limit; i++) {
            this.result *= i;
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
