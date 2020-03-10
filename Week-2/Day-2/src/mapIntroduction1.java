import java.util.HashMap;
import java.util.Map;

public class mapIntroduction1 {
    public static void main(String[] args) {

        System.out.println("");

        // Create empty mal with Key: Integer & Values: Char
        HashMap<Integer, Character> myFirstMap = new HashMap<>();

        // Print out the map no matter the content:
        System.out.println("The content of myMap: ");
        System.out.println(myFirstMap);

        // add some key.values to the Map
        myFirstMap.put(97, 'a');
        myFirstMap.put(98, 'b');
        myFirstMap.put(99, 'c');
        myFirstMap.put(65, 'A');
        myFirstMap.put(66, 'B');
        myFirstMap.put(67, 'C');

        // Print all the keys
        System.out.println();
        System.out.println("Print all the keys: ");
        for (Integer key : myFirstMap.keySet()) {
            System.out.println(key);
        }

        // Print all the Values
        System.out.println();
        System.out.println("Print all the values: ");
        for (Character value : myFirstMap.values()){
            System.out.println(value);
        }

        // Add Value D with Key 68
        System.out.println();
        System.out.println("Add key 68 with Value D: ");
        myFirstMap.put(68, 'D');
        System.out.println(myFirstMap);

        // Amount of key-value pairs in the map
        int counter = 0;
        for (Integer key : myFirstMap.keySet()) {
            counter++;
        }
        System.out.println();
        System.out.println("Amanount of key.value pairs: " + counter);

        // Bring the value associated with Key: 99
        System.out.println();
        System.out.println("Show the value that is associated with Key: 99 ");
        System.out.println(myFirstMap.get(99));

        // Remove key.value pair of Key: 97
        System.out.println();
        myFirstMap.remove(97);
        System.out.println(myFirstMap);

        // Print key 100, whether there is a Value or not associated --> Null if no Value
        System.out.println();
        System.out.println("Value of Key: 100 ");
        System.out.println(myFirstMap.get(100));

        // remove all key.value Pairs
        myFirstMap.clear();
        System.out.println();
        System.out.println("After removing all key.value-Pairs: ");
        System.out.println(myFirstMap);

    }
}
