package com.greenfoxacademy.restapi.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {

    private String what;
    private List<Integer> numbers;

    public ArrayHandler() {
        this.numbers = new ArrayList<>();
    }

    public String getWhat() {

        return what;
    }

    public void setWhat(String what) {

        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
