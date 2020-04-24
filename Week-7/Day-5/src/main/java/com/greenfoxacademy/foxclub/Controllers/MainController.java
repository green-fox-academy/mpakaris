package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String logIn(Model model) {
        foxService.addStartingFox();
        return "login";
    }

    @RequestMapping (value = "/checkUserName", method = RequestMethod.POST)
    public String checkUserName(@RequestParam (value = "petName") String foxName, Model model) {
        model.addAttribute("nameFox", foxService.logIn(foxName));
        return "login";
    }








}
