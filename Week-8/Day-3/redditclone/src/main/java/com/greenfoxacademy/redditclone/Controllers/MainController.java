package com.greenfoxacademy.redditclone.Controllers;

import com.greenfoxacademy.redditclone.Models.User;
import com.greenfoxacademy.redditclone.Services.ArticleService;
import com.greenfoxacademy.redditclone.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private ArticleService articleService;
    private UserService userService;

    public MainController(ArticleService articleService, UserService userService) {
        this.articleService = articleService;
        this.userService = userService;
    }

    @GetMapping({"/", "/main", "/home"})
    public String renderMain(Model model){
        return "main";
    }


    // Get and Post for LogIn:
    @GetMapping("/login")
    public String renderLogIn(Model model) {
        model.addAttribute("login", true);
        return "main";
    }

    @PostMapping("/login")
    public String renderLogIn(@RequestParam (value = "userName") String name,
                              @RequestParam (value = "userPassword") String password){
        if(userService.loginUser(name, password) != null) {
            return "redirect:/welcome/" + name;
        } else {
            return "redirect:/main";
        }
    }

    //Get and Post for NewUser:
    @GetMapping("/newUser")
    public String renderNewUser(Model model) {
        model.addAttribute("newUser", true);
        return "main";
    }

    @PostMapping("/newUser")
    public String renderNewUser(@RequestParam (value = "userName") String name,
                                @RequestParam (value = "userPassword") String password,
                                @RequestParam (value = "userEmail") String email, Model model){
        if (userService.createUser(name, password, email) == 1) {
            return "redirect:/welcome/" + name;
        } else {
            return "redirect:/main";
        }
    }

    //Get for Welcome after login || New User:
    @GetMapping("/welcome/{name}")
    public String renderWelcome(@PathVariable (value = "name") String userName, Model model) {
        if (userService.fetchUserByUserName(userName) != null) {
            model.addAttribute("user", userService.fetchUserByUserName(userName));
            return "welcome";
        } else {
            return "redirect:/";
        }
    }

}
