package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.Services.Blue;
import com.greenfoxacademy.demo.Services.Printer;
import com.greenfoxacademy.demo.Services.Red;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication<blue> implements CommandLineRunner {

    private Red red;
    private Blue blue;

    @Autowired
    public DemoApplication(Red red, Blue blue) {
        this.red = red;
        this.blue = blue;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        red.printColor();
        blue.printColor();
    }
}
