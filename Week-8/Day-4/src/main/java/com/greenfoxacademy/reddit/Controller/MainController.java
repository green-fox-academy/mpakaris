package com.greenfoxacademy.reddit.Controller;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.Services.ArticleService;
import com.greenfoxacademy.reddit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private UserService userService;
    private ArticleService articleService;

    @Autowired
    public MainController(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    @GetMapping ("/index")
    public String renderLogInPage() {
        return "index";
    }

    @PostMapping("/loginUser")
    public String evaluateLoginData(@RequestParam String userName,
                                    @RequestParam String userPassword) {
        User user = userService.evaluateLoginData(userName, userPassword);
        if (user.isloggedIn() == true) {
            return "redirect:/listArticles/" + user.getId();
        } else {
            return "redirect:/index";
        }
    }

    @PostMapping("/createUser")
    public String createNewUser(@RequestParam String userName,
                                @RequestParam String userEmail,
                                @RequestParam String userPassword) {
        User user = userService.createNewUser(userName, userEmail, userPassword);
        if (user.isloggedIn() == true) {
            return "redirect:/listArticles/" + user.getId();
        } else {
            return "redirect:/index";
        }
    }

    @GetMapping ("/listArticles/{userID}")
    public String renderMainPage(@PathVariable long userID, Model model){
        model.addAttribute("articles", articleService.getAllArticles());
        model.addAttribute("user", userService.findUserByID(userID));
        return "main";
    }

    @PostMapping ("/createArticle/{userID}")
    public String createArticle (@PathVariable long userID,
                                 @RequestParam String article,
                                 @RequestParam String url) {
        articleService.createArticle(article, url, userID);
        return "redirect:/listArticles/" + userID;
    }

    @GetMapping("/upvote/{articleID}/{userID}")
    public String upvoteArticle(@PathVariable long articleID,
                                @PathVariable long userID) {
        articleService.upvoteArticle(articleID);
        return "redirect:/listArticles/" + userID;
    }

    @GetMapping("/downvote/{articleID}/{userID}")
    public String downvoteArticle(@PathVariable long articleID,
                                  @PathVariable long userID){
        articleService.downvoteArticle(articleID);
        return "redirect:/listArticles/" + userID;
    }

    @PostMapping("/logout/{userID}")
    public String logoutUser(@PathVariable long userID) {
        userService.logoutUserByID(userID);
        return "redirect:/index";
    }

    @GetMapping("/editArticle/{articleID}/{userID}")
    public String editOwnArticles(@PathVariable long articleID,
                                  @PathVariable long userID, Model model) {
        model.addAttribute("articleToEdit", articleService.findArticleByID(articleID));
        model.addAttribute("articles", articleService.getAllArticles());
        model.addAttribute("user", userService.findUserByID(userID));
        return "main";
    }

    @PostMapping("/editArticle/{articleID}/{userID}")
    public String editOwnArticles(@PathVariable long articleID,
                                  @PathVariable long userID,
                                  @RequestParam String articleTitle,
                                  @RequestParam String articleUrl) {
        articleService.editOwnArticle(articleID, articleTitle, articleUrl, userID);
        return "redirect:/listArticles/" + userID;
    }

    @GetMapping("/deleteArticle/{articleID}/{userID}")
    public String deleteOwnArticle(@PathVariable long articleID,
                                   @PathVariable long userID) {
        articleService.deleteOwnArticle(articleID, userID);
        return "redirect:/listArticles/" + userID;
    }

}
