package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping (value = {"/", "/main", "/index", "/home"}, method = RequestMethod.GET)
    public String renderMain(Model model) {
        this.foxService.initServices();
        return "main";
    }

    @GetMapping ("/chooseFox")
    public String renderFoxesMain (Model model) {
        return "laci";
    }

    @GetMapping ("/createFox")
    public String renderCreatePage() {

        return "create";
    }

    @PostMapping ("/createFox")
    public String createNewFoxPage(@RequestParam (value = "nameOfFox") String nameNewFox) {
        this.foxService.createNewFox(nameNewFox);
        return "redirect:/info?name="+ nameNewFox;
    }

    @GetMapping ("/info")
    public String renderInfoPage(@RequestParam (value = "name") String name, Model model) {
    model.addAttribute("fox", this.foxService.getFox(name));
    return "info";
    }










}
