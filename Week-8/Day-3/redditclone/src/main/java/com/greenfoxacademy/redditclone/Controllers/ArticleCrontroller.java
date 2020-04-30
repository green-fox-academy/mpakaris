package com.greenfoxacademy.redditclone.Controllers;

import com.greenfoxacademy.redditclone.Services.ArticleService;
import com.greenfoxacademy.redditclone.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleCrontroller {

    private UserService userService;
    private ArticleService articleService;

    public ArticleCrontroller(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    // RENDERING OF MAIN PORTAL-PAGE
    @GetMapping("/index/{userID}")
    public String renderMainPage(@PathVariable( value = "userID") long userID, Model model) {
        model.addAttribute("user", userService.fetchUserByUserID(userID));

        return  "index";
    }

    @GetMapping ("/createArticle/{userID}")
    public String showArticleSubmitForm(@PathVariable (value = "userID") long userID, Model model) {
        model.addAttribute("showSubmit", true);
        model.addAttribute("user", userService.fetchUserByUserID(userID));
        return "index";
    }


    @PostMapping ("/createArticle/{userID}")
    public String createSubmittedArticle(@PathVariable (value = "userID") long userID,
                                      @RequestParam (value = "title") String title,
                                      @RequestParam (value = "url") String url,
                                      @RequestParam (value = "content") String content, Model model) {
        articleService.createArticle(userID, title, url, content);
        model.addAttribute("user", userService.fetchUserByUserID(userID));
        model.addAttribute("createdSuccessfully", true);
        return "index";
    }






}
