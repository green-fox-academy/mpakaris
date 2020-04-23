package com.greenfoxacademy.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class Lime implements MyColor {

    @Override
    public void printColor() {
        System.out.println("This is printing in Blue Colour.");
    }
}
