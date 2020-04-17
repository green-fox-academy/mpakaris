package com.greenfoxacademy.webshopdemo.controllers;

import com.greenfoxacademy.webshopdemo.models.Product;
import com.greenfoxacademy.webshopdemo.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Controller
public class MainController {

    private WebShop webShop = new WebShop();

    @RequestMapping (value = {"", "/", "/main"})
    public String displayMainPage(Model model) {
        model.addAttribute("listOfProducts", webShop.getWebShopContent());
        model.addAttribute("margin", "margin: 10px");
        return "main";
    }

    @RequestMapping (value = "/available")
    public String displayOnlyAvailable(Model model) {
        model.addAttribute("listOfProducts", webShop.getAvailavleItems());
        model.addAttribute("margin", "margin: 10px");
        return "main";
    }

    @RequestMapping (value = "/cheapest")
    public String displayCheapest(Model model) {
        model.addAttribute("listOfProducts", webShop.getCheapest());
        model.addAttribute("margin", "margin: 10px");
        return "main";
    }

    @RequestMapping (value = "/containsNike")
    public String displayContainsNike(Model model) {
        model.addAttribute("listOfProducts", webShop.getContainsNike());
        model.addAttribute("margin", "margin: 10px");
        return "main";
    }

    @RequestMapping (value = "/averageStock")
    public String displayAverageStock(Model model) {
        model.addAttribute("averageStock", webShop.getAverageStock().orElse(0));
        model.addAttribute("margin", "margin: 10px");
        model.addAttribute("padding", "padding: 10px");
        return "averageStock";
    }

    @RequestMapping (value = "/mostExpensiveProduct")
    public String displayMostExpensiveProduct(Model model) {
        model.addAttribute("listOfProducts", webShop.getMostExpensiveItem().get(0));
        model.addAttribute("margin", "margin: 10px");
        return "main";
    }

   @RequestMapping (value = "/searchQuery", method = RequestMethod.GET)
    public String submitSearchQuery(@RequestParam (value = "searchFor") String search, Model model) {
       model.addAttribute("listOfProducts", webShop.getResultOfSearchQuery(search));
       model.addAttribute("margin", "margin: 10px");
       return "main";
    }
}
