package com.greenfoxacademy.restapi.Models;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandlerDouble {

    private List<Integer> result;

    public ArrayHandlerDouble(List<Integer> array) {

        this.result = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            this.result.add(array.get(i)*2);
        }
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
