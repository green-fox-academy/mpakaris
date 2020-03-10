import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class productDatabase {
    public static void main(String[] args) {
        System.out.println();

        // reate a map with the key-value pairs
        HashMap<String, Integer> productDatabase = new HashMap<>();
        productDatabase.put("Eggs", 20);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        System.out.println("This is our Database: ");
        System.out.println(productDatabase);
        System.out.println();

        // How much is the fish?
        System.out.println("Price of Fish: ");
        System.out.println("Fish costs: " + productDatabase.get("Fish") + " HUF");
        System.out.println();

        // What is the most expensive product?
        int expensive = productDatabase.get("Eggs");
        String mostExpensiveItem = "";
        System.out.println("First value: " + expensive);
        for (Map.Entry<String, Integer> item : productDatabase.entrySet()) {
            if (item.getValue() > expensive){
                expensive = item.getValue();
                mostExpensiveItem = item.getKey();
            }
        }
        System.out.println("The most expensive item is: " + mostExpensiveItem);
        System.out.println();

        // What is the average price?
        int counter = 0;
        int sum = 0;
        for (Integer item : productDatabase.values()) {
            counter++;
            sum = sum + item;
        }
        int average = sum/counter;
        System.out.println("The average price is: " + average);
        System.out.println();

        // How many products' price is below 300?
        int counter2 = 0;
        for (Integer item : productDatabase.values()) {
            if (item < 300)
                counter2++;
        }
        System.out.println("There are " + counter2 + " Items below 300.");
        System.out.println();

        // Is there anything we can buy for exactly 125
        int costExactly = 125;
        boolean index = false;
        String productExactly = "";
        for (Map.Entry<String, Integer> item : productDatabase.entrySet()) {

            if (item.getValue() == costExactly) {
                index = true;
                productExactly = item.getKey();
            }
        }
        if (index) {
            System.out.println("The Item " + productExactly + " costs exactly 125.");
        } else
            System.out.println("Sorry, no item costs exactly 125.");
        System.out.println();

        // What is the cheapest product?
        String cheapestItemOnList = "Eggs";
        int cheapestItemPrice = productDatabase.get("Eggs");

        for (Map.Entry<String, Integer> item : productDatabase.entrySet()) {

            if (item.getValue() < cheapestItemPrice) {
                cheapestItemPrice = item.getValue();
                cheapestItemOnList = item.getKey();
            }
        }
        System.out.println("The cheapest item on the list is " + cheapestItemOnList + " with price of " + cheapestItemPrice + " HUF");
        System.out.println();

        // ProductDatabase2
        // Create an application which solves the following problems:
        // Which products cost less than 201? (just the name)
        System.out.println("Which products cost less than 201?");
        ArrayList<String> productsLessThan200 = new ArrayList<>();
        for (Map.Entry<String, Integer> item : productDatabase.entrySet()) {
            if (item.getValue() < 200)
                productsLessThan200.add(item.getKey());
        }
        System.out.println("The following items cost less than 201: ");
        System.out.println(productsLessThan200);
        System.out.println();

        // Which products cost more than 150? (name + price)
        System.out.println("Which products cost more than 150? Name and Price");

        // Info to Solve: Create a new HashMap and push Data into There!!









    }
}
