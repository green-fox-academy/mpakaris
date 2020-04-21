package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    List<BankAccount> listOfAccounts = new ArrayList<>();

    @RequestMapping (value = "/show")
    public String show (Model model) {
        if (listOfAccounts.size() == 0) {
            BankAccount simba = new BankAccount("Simba", 2000, "Lion");
            BankAccount mufasa = new BankAccount("Mufasa", 20000, "Lion");
            BankAccount zazoo = new BankAccount("Zazoo", 5000, "Tucan");
            BankAccount skar = new BankAccount("Skar", 800, "Lion");
            BankAccount pumba = new BankAccount("Pumba", 100, "Pumba");
            BankAccount timon = new BankAccount("Timon", 233, "Meerkat");

            listOfAccounts.add(simba);
            listOfAccounts.add(mufasa);
            listOfAccounts.add(zazoo);
            listOfAccounts.add(skar);
            listOfAccounts.add(pumba);
            listOfAccounts.add(timon);
        }

        model.addAttribute("listOfAccounts", listOfAccounts);
        return "show";
    }

    @RequestMapping (value = "/sentence")
    public String displaySentece (Model model) {
    String sentence = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    model.addAttribute("sentence", sentence);
        return "sentence";
    }

    @PostMapping (value = "/raiseBalance")
    public String raiseBalance (Model model) {
        for (BankAccount person : listOfAccounts) {
            if (person.isKing()) {
                person.setBalance(100);
            } else {
                person.setBalance(10);
            }
        }
        return "redirect:/show";
    }

    @PostMapping (value = "/addAccount")
    public String addAccount (@ModelAttribute BankAccount newUser) {
        listOfAccounts.add(newUser);
        return "redirect:/show";
    }

    @PostMapping (value = "/deleteAccount")
    public String deleteAccount (String name) {
        int index = 1000;
        for (BankAccount user : listOfAccounts) {
            if (user.getName().toLowerCase().equals(name.toLowerCase())) {
                index = listOfAccounts.indexOf(user);
            }
        }
        listOfAccounts.remove(index);
        return "redirect:/show";
    }



}
