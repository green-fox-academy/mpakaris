package com.greenfoxacademy.webshopdemo.controllers;

import com.greenfoxacademy.webshopdemo.models.ButtonList;
import com.greenfoxacademy.webshopdemo.models.Product;
import com.greenfoxacademy.webshopdemo.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private WebShop webShop = new WebShop();
    private ButtonList buttonList = new ButtonList();

    public MainController() throws Exception {
    }

    @RequestMapping (value = {"", "/", "/main", "/webshop"})
    public String displayMainPage(Model model) {
        model.addAttribute("listOfProducts", webShop.getWebShopContent());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/available")
    public String displayOnlyAvailable(Model model) {
        model.addAttribute("listOfProducts", webShop.getAvailableItems());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/cheapest")
    public String displayCheapest(Model model) {
        model.addAttribute("listOfProducts", webShop.getCheapest());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/containsNike")
    public String displayContainsNike(Model model) {
        model.addAttribute("listOfProducts", webShop.getContainsNike());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/averageStock")
    public String displayAverageStock(Model model) {
        model.addAttribute("averageStock", webShop.getAverageStock().orElse(0));
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "averageStock";
    }

    @RequestMapping (value = "/mostExpensiveProduct")
    public String displayMostExpensiveProduct(Model model) {
        model.addAttribute("listOfProducts", webShop.getMostExpensiveItem().get(0));
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

   @RequestMapping (value = "/searchQuery", method = RequestMethod.GET)
    public String submitSearchQuery(@RequestParam (value = "searchFor") String search, Model model) {
       model.addAttribute("listOfProducts", webShop.getResultOfSearchQuery(search));
       model.addAttribute("buttonList", buttonList.getListOfButtons());
       return "main";
    }

    @RequestMapping (value = "/setEURPrices")
    public String setEurPrices(Model model) {
        model.addAttribute("listOfProducts", webShop.changeCurrency());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/setHUFPrices")
    public String setHufPrices(Model model) {
        model.addAttribute("listOfProducts", webShop.setToOriginalCurrency());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/searchQueryPrice", method = RequestMethod.GET)
    public String submitPriceSearch(@RequestParam (value = "searchFor", required = true) String search,
                                    @RequestParam (value = "input", required = true) String input, Model model) {
        model.addAttribute("listOfProducts", webShop.getResultOfSearchQueryPrice(search, input));
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/addItem")
    public String dipslayAddItemForm(Model model) {
        return "addItem";
    }

    @RequestMapping (value = "/addItemToList", method = RequestMethod.POST)
    public String addItemToList(@RequestParam (value = "name") String name,
                                @RequestParam (value = "type") String type,
                                @RequestParam (value = "description") String description,
                                @RequestParam (value = "price") String price,
                                @RequestParam (value = "stock") String stock,
                                @RequestParam (value = "picUrl") String picURL,
                                Model model) throws Exception {
        webShop.addItemToWebShop(new Product(name, type, description, Double.parseDouble(price), "HUF", Integer.parseInt(stock), picURL));
        model.addAttribute("listOfProducts", webShop.getWebShopContent());
        model.addAttribute("buttonList", buttonList.getListOfButtons());
        return "main";
    }

    @RequestMapping (value = "/deleteItem")
    public String deleteItemFromList(Model model) {
        model.addAttribute("listOfProducts", webShop.getWebShopContent());
        return "deleteItem";
    }
}
 