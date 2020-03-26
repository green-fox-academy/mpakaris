package WebShop;

public class ShoeClass { 
    public static void main(String[] args) {
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

    }

}
