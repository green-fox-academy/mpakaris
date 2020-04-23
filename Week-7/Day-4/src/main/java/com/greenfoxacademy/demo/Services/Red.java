package com.greenfoxacademy.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {

    private Printer printer;

    @Autowired
    public Red(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("This is printing in Red Colour.");
    }
}
