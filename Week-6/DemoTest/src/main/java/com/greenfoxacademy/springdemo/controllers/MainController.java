package com.greenfoxacademy.springdemo.controllers;

import com.greenfoxacademy.springdemo.models.SimpleObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping(value = {"", "/", "/main", "/first"}, method = RequestMethod.GET)
    public String renderMain(Model model) {

        model.addAttribute("name", "Niko");

        return "main";
    }

    @RequestMapping(value = "/page1")
    public SimpleObject renderPage1() {
        return new SimpleObject("Nikos Mpakaris");
    }


}
