package WebShop;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // region Task description
        // Create a command line Webshop for shoes that communicates with the user via Scanner inputs.
        // Each shoe should have
        // - a name (String),
        // - a gender (String: "M" for male, "F" for female),
        // - a list of available sizes (list of integers),
        // - a price (integer)
        // - and quantity (integer) for the number of available items.

        // Make sure the user cannot add two items with the same name!

        // You can create two versions:
        // One that works with, and one that works without saving/reading the data from a file
        // -1. The first version shall store/retrieve data from an ArrayList<HashMap<String, Object>> products = new ArrayList();
        // (here you can add any type of values to the HashMap and use the key to define which property of the shoe you store

        // -2. In the second version you should store the shoes in the assets/shoes.csv file, in the following format:
        // Nike;F;36-37-38;3000;30
        // Make sure that you use ";" as a delimiter

        // Your app should have the following functionality:
        // `Pressing: l` should list all the items and their attributes in the following format:
        // We have Nike in the female version. Available sizes are: 36,37,38. The price of the shoe is 3000Ft.There are 30 items available."
        // Pressing: 'l Nik` should list  all the shoes which have the second parameter (Nik) in their name
        // `Pressing: s 35` should list all the shoes that have this size
        // `Pressing: a` should allow adding a new shoe (ask for each property in a separate line from the user, except the available sizes)
        // `Pressing: d Nike` should allow deleting the shoe that has the given name. Write a case insensitive logic.
        // If the shoe does not exist, the user must be notified:
        // "Cannot delete, there is no shoe with the name: "Nike"
        // `Pressing: q` should terminate the webshop
        // Pressing anything else should display:
        // "Invalid command"
        //endregion

        // Call for Menu
        Shoe shoe = new Shoe();


        System.out.println();
            if (args.length == 0) {
                callMenu();
            } else if (args[0].equals("-l")) {
                listAllShoes(args);
            } else if (args[0].equals("-s")) {
                listBySize(args);
            } else if (args[0].equals("-a")) {
                addShoeToList();
            } else if (args[0].equals("-w")) {
                writeToCsvFile();
            } else if (args[0].equals("-d")) {

            } else {
                System.out.println("Invalid command.");
            }
    }

    public static void callMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("This is Niko's AWESOME Shoe-Webshop-App");
        System.out.println("=================================");
        System.out.println("press '-l' to show a list of all shoes");
        System.out.println("press '-s' and a shoe-size to see available shoes in that size");
        System.out.println("press '-a' to add a new show to the Warehouse-Sortiment");
        System.out.println("press '-d' and a shoe Name to delete from Warehouse");
        System.out.println("press '-q' to quit shop");
        System.out.println("=================================");
    }

    public static void listAllShoes(String[] args) throws IOException {
        ArrayList<String> fileContent = new ArrayList<>();
        String[] splitLineOfLine = new String[5];
        ArrayList<String[]> splitArrayOfEachLine = new ArrayList<>();
        if (args.length == 1) {
            Path path = Paths.get("src/assets/webshop.csv");
            BufferedReader reader = new BufferedReader(new FileReader("src/assets/webshop.csv"));
            String line = reader.readLine();
            while (line != null) {
                // push each line of CSV file into an arrayList
                splitLineOfLine = line.split(";");
                splitArrayOfEachLine.add(splitLineOfLine);
                // read next line
                line = reader.readLine();
            }
            reader.close();
            // Print all the Content of the CSV File
            System.out.println("Currently the Shoes in the Shop: ");
            for (String[] array : splitArrayOfEachLine) {
                String gender = "";
                if (array[1].equals("F")) {
                    gender = "Female";
                } else {
                    gender = "Male";
                }
               System.out.println("We have " + array[0] + " in the " + gender + " version. Available sizes are: " + array[2] + ". The priece of the Shoe is " + array[3] + "HUF. There are " + array[4] + " items available.");
            }
        } else {
            Path path = Paths.get("src/assets/webshop.csv");
            BufferedReader reader = new BufferedReader(new FileReader("src/assets/webshop.csv"));
            String line = reader.readLine();
            while (line != null) {
                // push each line of CSV file into an arrayList
                splitLineOfLine = line.split(";");
                splitArrayOfEachLine.add(splitLineOfLine);
                // read next line
                line = reader.readLine();
            }
            reader.close();
            String subStr = args[1];
            for (String[] array : splitArrayOfEachLine) {
                if (array[0].contains(subStr)) {
                    System.out.println("Where you looking for " + "'" + array[0] + "'" + " shoes?");
                    System.out.println("We have " + array[0] + " in the " + array[1] + " version. Available sizes are: " + array[2] + ". The priece of the Shoe is " + array[3] + "HUF. There are " + array[4] + " items available.");
                }
            }
        }
    }

    public static void listBySize(String[] args) throws Exception {
        ArrayList<String> fileContent = new ArrayList<>();
        String[] splitLineOfLine = new String[5];
        ArrayList<String[]> splitArrayOfEachLine = new ArrayList<>();
        if (args.length == 1) {
            throw new Exception("No valid size was given.");
        } else {
            Path path = Paths.get("src/assets/webshop.csv");
            BufferedReader reader = new BufferedReader(new FileReader("src/assets/webshop.csv"));
            String line = reader.readLine();
            while (line != null) {
                // push each line of CSV file into an arrayList
                splitLineOfLine = line.split(";");
                splitArrayOfEachLine.add(splitLineOfLine);
                // read next line
                line = reader.readLine();
            }
            reader.close();
            int counter = 0;
            System.out.println("Current models available in Seize: " + args[1]);
            for (String[] array : splitArrayOfEachLine) {
                if (array[2].contains(args[1])) {
                    System.out.println("We have " + array[0] + " in the " + array[1] +
                            " version. Available sizes are: " + array[2] +
                            ". The priece of the Shoe is " + array[3] + "HUF. There are " +
                            array[4] + " items available.");
                } else {
                    counter++;
                }
            }
            if (counter == splitArrayOfEachLine.size()) {
                System.out.println("Sorry, currently Seize " + args[1] + "-Shoes are out of Stock.");
            }
        }
    }

    public static void addShoeToList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here you can add a Shoe to the Warehouse: ");

        System.out.println("Press 'M' for Male and 'F' for Female Model: ");
        String gender = scanner.nextLine();
        System.out.println("Which sizes are available:");
        boolean exit = false;
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        while (!exit) {
            System.out.println("Please add a size: ");
            int size = scanner.nextInt();
            if (sizes.contains(size)) {
                System.out.println("This size was already mentioned.");
            } else {
                sizes.add(size);
            }
            System.out.println("Would you like to add another size? Press '1' for Yes or '0' for No");
            int answerInput= scanner.nextInt();
            if (answerInput == 0) {
                exit = true;
            }
        }
        System.out.println("What is the price of the model:");
    }

    public static void writeToCsvFile() throws IOException {
        String[] testArray = {"Adidas", "M", "40-41-42-43", "10.000", "20"};
        FileWriter writer = new FileWriter("src/assets/webshop.csv", true);
        writer.append(testArray[0]);
        writer.append(";");
        writer.append(testArray[1]);
        writer.append(";");
        writer.append(testArray[2]);
        writer.append(";");
        writer.append(testArray[3]);
        writer.append(";");
        writer.append(testArray[4]);
        writer.append("\n");
        writer.flush();
        writer.close();
        System.out.println("Added to Database succesfully!");
    }




}
