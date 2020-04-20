package com.greenfoxacademy.webshopdemo.models;

import org.springframework.util.ResourceUtils;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.io.FileWriter;

import static java.util.stream.Collectors.*;

public class WebShop {

    private List<Product> webShopContent;
    private List<Double> listOfOriginalPrices;

    public WebShop() throws Exception {
        this.webShopContent = new ArrayList<>();
        fill();
    }

    public void fill() throws Exception {
        webShopContent.clear();
        ArrayList<String[]> splitArrayOfEachLine = new ArrayList<>();
        try {
            File file = ResourceUtils.getFile("classpath:productList/webShopItems.csv");
            System.out.println("File found: " + file.exists());
            String line = new String(Files.readAllBytes(file.toPath()));
            String[] lineCleared = line.split("\r\n");
            for (int i = 0; i < lineCleared.length; i++) {
                splitArrayOfEachLine.add(lineCleared[i].split(";"));
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File not found");
        } catch (IOException e) {
            throw new Exception("File could not be read");
        }
        for (int i = 0; i < splitArrayOfEachLine.size(); i++) {
            webShopContent.add(new Product (splitArrayOfEachLine.get(i)[0],
                    splitArrayOfEachLine.get(i)[1],
                    splitArrayOfEachLine.get(i)[2],
                    Double.parseDouble(splitArrayOfEachLine.get(i)[3]),
                    splitArrayOfEachLine.get(i)[4],
                    Integer.parseInt(splitArrayOfEachLine.get(i)[5]),
                    splitArrayOfEachLine.get(i)[6]));
        }
        copyPrices();
    }

    public List<Product> addItemToWebShop(Product itemToAdd) throws Exception {
        try {
            FileWriter csvWriter = new FileWriter("C:\\Angular\\greenfox\\mpakaris\\Week-6\\Day-5\\src\\main\\resources\\productList\\webShopItems.csv", true);
            String lineToAdd = itemToAdd.getName() + ";"
                    + itemToAdd.getType() + ";"
                    + itemToAdd.getDescription() + ";"
                    + Double.toString(itemToAdd.getPrice()) + ";"
                    + "HUF;"
                    + Integer.toString(itemToAdd.getQuantityStock()) + ";"
                    + itemToAdd.getPicURL();
            csvWriter.append(lineToAdd).append("\r\n");
            csvWriter.flush();
            csvWriter.close();
            webShopContent.add(new Product(itemToAdd.getName(),
                    itemToAdd.getType(), itemToAdd.getDescription(),
                    itemToAdd.getPrice(), "HUF", itemToAdd.getQuantityStock(), itemToAdd.getPicURL()));
        } catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return this.webShopContent;
    }

    public void copyPrices() {
        this.listOfOriginalPrices = webShopContent
                .stream()
                .map(p -> Math.round(p.getPrice()*100.0)/100.0)
                .collect(toList());
    }

    public List<Product> getWebShopContent() {
        return webShopContent;
    }

    public List<Product> getAvailableItems() {
        return this.webShopContent
                .stream()
                .filter(item -> item.isInStock())
                .collect(toList());
    }

    public List<Product> getCheapest() {
        return this.webShopContent
                .stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(toList());
    }

    public List<Product> getContainsNike() {
        return this.webShopContent
                .stream()
                .filter(item -> item.getName().contains("Nike") || item.getDescription().contains("Nike"))
                .collect(toList());
    }

    public OptionalDouble getAverageStock() {
        return this.webShopContent
                .stream()
                .mapToInt(item -> item.getQuantityStock())
                .average();
    }

    public List<Product> getMostExpensiveItem () {
        return this.webShopContent
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(toList());
    }

    public List<Product> getResultOfSearchQuery(String searchQuery) {
        return this.webShopContent
                .stream()
                .filter(item -> item.getName().toLowerCase().contains(searchQuery.toLowerCase())
                        || item.getDescription().toLowerCase().contains(searchQuery.toLowerCase())
                        || item.getType().toLowerCase().contains(searchQuery.toLowerCase()))
                .collect(toList());
   }

   public List<Product> changeCurrency() {
       for (int i = 0; i < this.webShopContent.size(); i++) {
           this.webShopContent.get(i).setPrice((int)(Math.round(this.webShopContent.get(i).getPrice()/350 * 100))/100.0);
           this.webShopContent.get(i).setCurrency("EUR");
       }
       return this.webShopContent;
   }

   public List<Product> setToOriginalCurrency() {
       for (int i = 0; i < this.webShopContent.size(); i++) {
           this.webShopContent.get(i).setPrice(listOfOriginalPrices.get(i));
           this.webShopContent.get(i).setCurrency("HUF");
       }
       return this.webShopContent;
   }

    public List<Product> getResultOfSearchQueryPrice(String price, String priceQuery) {
        double d = Double.parseDouble(price);
        if (priceQuery.toLowerCase().equals("exact")) {
            return webShopContent
                    .stream()
                    .filter(p -> p.getPrice() == d)
                    .collect(Collectors.toList());
        } else if (priceQuery.toLowerCase().equals("above")) {
            return webShopContent
                    .stream()
                    .filter(p -> p.getPrice() > d)
                    .collect(Collectors.toList());
        } else {
            return webShopContent
                    .stream()
                    .filter(p -> p.getPrice() < d)
                    .collect(Collectors.toList());
        }
    }



}
