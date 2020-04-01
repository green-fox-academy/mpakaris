package WebShop;

import java.util.Scanner;

public class Shoe {

    Scanner scanner = new Scanner(System.in);

    protected String name, gender;
    protected int size, price, quantity;


    public Shoe () {
        this.name = name;
        this.gender = gender;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean addBrand() {
        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        this.name = brand;// Check if Brand is already available!

        return true;
    }

    public boolean addGender() {

        return true;
    }

    public boolean addSizes() {

        return true;
    }

    public boolean addPrice() {

        return true;
    }

    public boolean addQuantity() {

        return true;
    }

    public void getShoe() {


    }




}
