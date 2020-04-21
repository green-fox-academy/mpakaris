package com.greenfox.demo.Controller;


import com.greenfox.demo.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {

    private List<Book> books;

    @RequestMapping (value = "/books", method = RequestMethod.GET)
    public String showBooks(Model model) {
        books.
        model.addAttribute("books", )

        return "index";
    }



















}
