package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private AtomicLong counter = new AtomicLong(0);

    @RequestMapping (value = "/greeting")
    public Greeting greeting(@RequestParam ("name") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello, " + name + "!");
    }
}
