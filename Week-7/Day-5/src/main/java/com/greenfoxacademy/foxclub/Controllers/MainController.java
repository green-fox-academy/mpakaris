package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Model.Fox;
import com.greenfoxacademy.foxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;
    private Fox currentFox;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String logIn() {
        foxService.addStartingFox();
            return "login";
    }

    @RequestMapping (value = "/login", method = RequestMethod.POST)
    public String checkUserName(@RequestParam (value = "petName") String foxName, Model model) {
        if (foxName.isEmpty()) {
            return "redirect:/login";
        } else {
            this.currentFox = foxService.logIn(foxName);
            model.addAttribute("nameExists", currentFox.getName());
            model.addAttribute("nameFox", foxName);
            String reDirect = "redirect/login/?name="+ currentFox.getName();
            return "redirect:/?name=" + currentFox.getName();
        }
    }

    @GetMapping (value = "/")
    public String showFox (@RequestParam (value = "name") String name, Model model) {
        String tricks = "";
        if (name.isEmpty()) {
            return "/login";
        } else {
            model.addAttribute("nameFox", this.currentFox.getName());
            if (currentFox.getTricks().size() == 0) {
                model.addAttribute("tricksFox", "empty");
            } else {
                model.addAttribute("tricksFox", this.currentFox.getTricks());
            }
            return "fox";
        }
    }

    @GetMapping(value = "/nutritionStore")
    public String showNutritionStore (@RequestParam (value = "name") String name, String food, String drink, Model model) {
        if (name.isEmpty()) {
            return "redirect:/login";
        } else {
        model.addAttribute("nameFox", currentFox.getName());
        model.addAttribute("foodList", currentFox.getFood());
        model.addAttribute("drinkList", currentFox.getDrink());
        model.addAttribute("currentDrink", currentFox.getCurrentDrink());
        model.addAttribute("currentFood", currentFox.getCurrentFood());
        return "nutritionstore";
        }
    }

    @RequestMapping (value = "/changeFood", method = RequestMethod.POST)
    public String changeFoodDiet(@RequestParam (value = "foodItemSelected") String newFoodItem, Model model) {
        if (newFoodItem.isEmpty()) {
            return "redirect:/nutrionStore" + currentFox.getName();
        } else {
            currentFox.setCurrentFood(newFoodItem);
            model.addAttribute("newFoodItem", newFoodItem);
            return "redirect:/nutritionStore/?name=" + currentFox.getName();
        }
    }

    @RequestMapping (value = "/changeDrink", method = RequestMethod.POST)
    public String changeDrinkDiet(@RequestParam (value = "drinkItemSelected") String newDrinkItem, Model model) {
        if (newDrinkItem.isEmpty()) {
            return "redirect:/nutrionStore" + currentFox.getName();
        } else {
            currentFox.setCurrentDrink(newDrinkItem);
            model.addAttribute("newDrinkItem", newDrinkItem);
            return "redirect:/nutritionStore/?name=" + currentFox.getName();
        }
    }
}
