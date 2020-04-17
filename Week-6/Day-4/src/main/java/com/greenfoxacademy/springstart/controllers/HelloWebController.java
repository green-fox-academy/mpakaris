package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private AtomicLong counter = new AtomicLong(1);
    private String fontSize = "10";
    // private String fontColor = "black";

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam ("name") String name,  Model model) {

        /* String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den",
                "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Jó napot", "Halló",
                "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao",
                "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo",
                "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào",
                "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"}; */

        model.addAttribute("nameInput", name);
        // model.addAttribute("listOfHellos",  hellos);
        long counterCurrent = counter.get();
        String toDisplay = figureOutWhatToDisplay(counterCurrent);
        model.addAttribute("counter", toDisplay);
        counter.incrementAndGet();

        // model.addAttribute("color", "color: rgb(10, 322, 12)");
        // model.addAttribute("fontSize","font-size: " + this.fontSize + "px");

        return "greeting";
    }

    private String figureOutWhatToDisplay(long counterCurrent) {

        if (counterCurrent % 3 == 0 && counterCurrent % 5 == 0 && counterCurrent % 7 == 0) {
            this.fontSize = "72";
            return "Fizz Buzz Woof";
        } else if (counterCurrent % 3 == 0 && counterCurrent % 5 == 0) {
            this.fontSize = "48";
            return "Fizz Buzz";
        } else if (counterCurrent % 3 == 0 && counterCurrent % 7 == 0) {
            this.fontSize = "48";
            return "Fizz Woof";
        } else if (counterCurrent % 5 == 0 && counterCurrent % 7 == 0) {
            this.fontSize = "48";
            return "Buzz Woof";
        } else if (counterCurrent % 3 == 0) {
            this.fontSize = "24";
            return "Fizz";
        } else if (counterCurrent % 5 == 0) {
            this.fontSize = "24";
            return "Buzz";
        } else if (counterCurrent % 7 == 0) {
            this.fontSize = "24";
            return "Woof";
        }  else {
            this.fontSize = "10";
            return String.valueOf(counter);
        }
    }

    /* <h1 th:text="'Hello ' + ${nameInput}"></h1>
    <tr th:each = "hello: ${listOfHellos}">
        <div>
             <td th:text="${hello}"/>
        </div>
    </tr> */


}
