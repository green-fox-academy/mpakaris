package com.greenfoxacademy.examexercise.Controller;

import com.greenfoxacademy.examexercise.Model.Link;
import com.greenfoxacademy.examexercise.Service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private LinkService linkService;

    @GetMapping("/")
    public String renderMain(Model model) {
        model.addAttribute("link", new Link());
        return "main";
    }

    @PostMapping("/save-link")
    public String saveLink(@ModelAttribute Link link, BindingResult bindingResult, Model model) {

        if (linkService.checkIfAliasIsFree(link.getLinkAlias()) == 1) {
            model.addAttribute("aliasCreated", linkService.createLink(link));
            model.addAttribute("success", true);
            return "main";
        } else {
            model.addAttribute("info", bindingResult);
            model.addAttribute("aliasNotFree", true);
            return "main";
        }
    }



}
