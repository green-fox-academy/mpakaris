package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Model.Fox;
import com.greenfoxacademy.foxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;
    private Fox currentFox;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }






}
