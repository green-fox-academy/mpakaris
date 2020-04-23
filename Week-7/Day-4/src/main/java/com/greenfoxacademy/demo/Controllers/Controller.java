package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    private UtilityService utilityService;

    @Autowired
    public Controller (UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping (value = {"/", "/main", "/index", "/useful"})
    public String showMain() {
        return "main";
    }

    @RequestMapping (value = "/colored")
    public String showColoredBackground(Model model) {
        model.addAttribute("color", "background-color: " + utilityService.randomColor());
        return "main";
    }

    @RequestMapping (value = "/email", method = RequestMethod.POST)
    public String validateEmail(@RequestParam (value = "email") String email, Model model) {
        model.addAttribute("correctMail", utilityService.validate(email));
        model.addAttribute("email", email);
        email = "";
        return "main";
    }

    @RequestMapping (value = "/encode", method = RequestMethod.POST)
    public String goToCaesarEncode(@RequestParam (value = "textToEncode") String text,
                             @RequestParam (value = "index") int index, Model model) {
        model.addAttribute("encodedText", utilityService.encode(text, index));
        return "main";
    }

    @RequestMapping (value = "/decode", method = RequestMethod.POST)
    public String goToCaesarDecode(@RequestParam (value = "textToDecode") String text,
                                   @RequestParam (value = "index") int index, Model model) {
        model.addAttribute("decodedText", utilityService.decode(text, index));
        return "main";
    }


}
