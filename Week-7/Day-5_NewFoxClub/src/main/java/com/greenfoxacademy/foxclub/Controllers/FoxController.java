package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Services.FoodService;
import com.greenfoxacademy.foxclub.Services.FoxService;
import com.greenfoxacademy.foxclub.Services.TrickService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;
    private FoodService foodService;
    private TrickService trickService;

    @Autowired
    public FoxController(FoxService foxService, FoodService foodService, TrickService trickService) {
        this.foxService = foxService;
        this.foodService = foodService;
        this.trickService = trickService;
    }

    @GetMapping ("/nutrition")
    public String renderFoodPage(@RequestParam (value = "name") String name, Model model) {
        model.addAttribute("fox", foxService.getFox(name));
        model.addAttribute("foodList", foodService.getListOfFoods());
        model.addAttribute("drinksList", foodService.getListOfDrinks());
        return "nutrition";
    }

    @PostMapping ("/nutrition")
    public String renderChangeFoodSettings(@RequestParam (value = "newItem") String newItem,
                                           @RequestParam (value = "name") String name) {
        foxService.changeNutrition(newItem, name);
        return "redirect:/info?name=" + name;
    }

    @GetMapping ("/trick")
    public String renderTrickPage(@RequestParam (value = "name") String name, Model model) {
        model.addAttribute("fox", foxService.getFox(name));
        model.addAttribute("trickList", trickService.getTrickList());

        return "trick";
    }

    @PostMapping ("/trick")
    public String changeChangeTrick(@RequestParam (value = "name") String name,
                                    @RequestParam (value = "newTrick") String newTrick, Model model) {
        foxService.changeTrick(newTrick, name);
        return "redirect:/info?name=" + name;
    }

}
