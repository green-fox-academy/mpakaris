import java.util.ArrayList;

public class shoppingList {
    public static void main(String[] args) {
        System.out.println();

        // Create a list with the following items.
        // eggs, milk, fish, apples, bread and chicken
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add(0, "eggs");
        shoppingList.add(1, "milk");
        shoppingList.add(2, "fish");
        shoppingList.add(3, "apples");
        shoppingList.add(4, "bread");
        shoppingList.add(5, "chicken");
        System.out.println("Our shopping list: ");
        System.out.println(shoppingList);
        System.out.println();

        // Create an application which solves the following problems:
        // Do we have milk on the list?
        System.out.println("Does our List contain Milk?");
        if (shoppingList.contains("milk"))
            System.out.println("Yes, our List contains Milk!");
        else
            System.out.println("Sorry, no Milk yet on the List");
        System.out.println();

        // Do we have bananas on the list?
        System.out.println("Does our List contain Bananas?");
        if (shoppingList.contains("banana"))
            System.out.println("Yes, our List contains Bananas!");
        else
            System.out.println("Sorry, no Bananas yet on the List");









    }
}
