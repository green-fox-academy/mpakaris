import java.util.ArrayList;
import java.util.List;

public class listIntroduction1 {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> nameList = new ArrayList<>();

        // Print out Amount of Elements in our List
        System.out.println("Elements in our List: ");
        System.out.println(nameList.size());
        System.out.println("");

        // Print out "empty" list
        System.out.println("Content of List: ");
        System.out.println(nameList);
        System.out.println("");

        // add 3 Names to the nameList
        nameList.add("William");
        nameList.add("John");
        nameList.add("Amanda");
        System.out.println("Elements in our List: ");
        System.out.println(nameList.size());
        System.out.println("");
        System.out.println("Content of the Name List: ");
        System.out.println(nameList);

        // Print out the 3rd Element
        System.out.println();
        System.out.println("The third Element in the list is: ");
        System.out.println(nameList.get(2));

        // Iterate through List and print out each Name --> foreach-Loop
        System.out.println("");
        int counter = 1;
        for (String name : nameList)
              {
                  System.out.println("Name " + counter + ": ");
                  System.out.println(name);
                  System.out.println("");
                  counter++;
        }

        // Iterate through the List and print 1. William 2. John 3. Amanda
        System.out.println("");
        int counter_2 = 1;
        for (String name : nameList){
            System.out.println(counter_2 + ". " + name);
            counter_2++;
        }

        // Remove second Element
        System.out.println(" ");
        System.out.println("Remove the 2nd Element [" + nameList.get(1) + "] from the List: ");
        nameList.remove(1);
        System.out.println("Current list: ");
        System.out.println(nameList);

        // Iterate through list in reversed order and print out each name
        System.out.println(" ");
        System.out.println("The names in the list in reversed order: ");
        for (int i = nameList.size()-1; i >= 0 ; i--) {
            System.out.println(nameList.get(i));
        }

        // Remove all elements from List
        System.out.println("");
        nameList.clear();
        System.out.println("The list contains now: ");
        System.out.println(nameList);


    }
}
