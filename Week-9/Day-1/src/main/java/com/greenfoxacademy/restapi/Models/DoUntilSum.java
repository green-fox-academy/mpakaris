package com.greenfoxacademy.restapi.Models;

public class DoUntilSum {

    private int result;

    public DoUntilSum(int limit) {
        this.result = 0;
        for (int i = 1; i <= limit; i++) {
            this.result += i;
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
