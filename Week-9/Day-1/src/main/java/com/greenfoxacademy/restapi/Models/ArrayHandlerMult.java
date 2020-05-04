package com.greenfoxacademy.restapi.Models;

import java.util.List;

public class ArrayHandlerMult {

    private int result;

    public ArrayHandlerMult (List<Integer> array) {

        this.result = 1;
        for (int i = 0; i < array.size(); i++) {
            this.result *= array.get(i);
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
