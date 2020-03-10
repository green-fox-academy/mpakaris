import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listIntroduction2 {
    public static void main(String[] args) {

        // Create a list ('List A') which contains the following Values: Apple / Avocado / Blueberries/Durian / Lychee
        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        System.out.println("List A: ");
        System.out.println(listA);
        System.out.println();

        // Create a new list ('List B') with the values of List A
        ArrayList<String> listB = new ArrayList<>();
        listB = (ArrayList<String>) listA.clone(); // IMPORTANT: CLONE!!!!!! not just "=" otherwise changes will affect both Lists!!!
        System.out.println("List B: ");
        System.out.println(listB);

        // Print out whether List A contains Durian or not
        System.out.println();
        System.out.println("Print out List A whether Durian or not: ");
        for (String fruit : listA) {
            System.out.println(fruit);
        }

        // Remove Durian from List B
        listB.remove(3);
        System.out.println();
        System.out.println("Print out List B without Durian: ");
        System.out.println(listB);
        System.out.println(listA);

        // Add Kiwifruit to List A after the 4th element
        listA.add(4, "Kiwifruit");
        System.out.println();
        System.out.println("List A with Kiwi: ");
        System.out.println(listA);

        //Compare the size of List A and List B
        System.out.println();
        if (listA.equals(listB)) {
            System.out.println("List A is as long as List B");
        } else
            System.out.println("The two lists have different size");
        System.out.println();

        // Get the index of Avocado from List A
        int indexAvocado = 0;
        int resultIndex =0;
        for (String fruit : listA) {
           if (fruit == "Avocado")
                resultIndex = indexAvocado;
            indexAvocado++;
        }
        System.out.println("The Index of Avocado in List A is: " + resultIndex);

        // Get the index of Durian from List B
        System.out.println();
        int fruitExistsInList = listB.indexOf("Durian");
        System.out.println("Index of Durian in List B: ");
        if (fruitExistsInList == -1) {
            System.out.println("No such fruit in List B");
        } else
            System.out.println("Index is: " + fruitExistsInList);

        // Add Passion Fruit and Pomelo to List B in a single statement
        System.out.println();
        System.out.println("Add Pomelo and Passion Fruit to List B: ");
        List<String> pomeloPassionFruit = Arrays.asList( "Pomelo", "Passion Fruit");
        listB.addAll(pomeloPassionFruit);
        System.out.println(listB);

        // Print 3rd Element from List A
        System.out.println();
        System.out.println("3rd Element of List A: ");
        System.out.println(listA.get(2));
    }
}
