import java.util.HashMap;
import java.util.Map;

public class mapIntroduction2 {
    public static void main(String[] args) {

        System.out.println();
        //Create a map where the keys are strings and the values are strings with the following initial values
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("978-1-60309-452-8", "A Letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");
        System.out.println(myMap);

        // Print all the key-value pairs in the following format Value (Key) 
        System.out.println();
        for (Map.Entry<String, String> item: myMap.entrySet()) {
            System.out.println(item.getValue() + " (" + item.getKey() + ")");
        }
        System.out.println();
        // or different way: First fetch Keys, then assign Values to them
        for (String item : myMap.keySet()){
            System.out.println(myMap.get(item)+ " (" + item + ")");
        }

        // Remove the key-value pair with key 978-1-60309-444-3
        System.out.println();
        System.out.println("Remove item with ISBN: 978-1-60309-444-3");
        myMap.remove("978-1-60309-444-3");
        System.out.println(myMap);
        System.out.println();

        // Remove the key-value pair with value The Lab
        System.out.println("Remove Book with Title: The Lab");
        for (Map.Entry<String, String> item: myMap.entrySet()) {

            String valueOfEntry = item.getValue();
            String keyOfEntry = item.getKey();

            if(valueOfEntry == "The Lab") {
                myMap.remove(keyOfEntry);
            }
        }
        System.out.println(myMap);

        // Add two key-Values to the map
        myMap.put("978-1-60309-450-4", "They Calles us Enemy");
        myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println();
        System.out.println("Added 2 new books to inventory: ");
        System.out.println(myMap);

        // Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println();
        System.out.println("Print value to ISBN 78-0-61159-424-8: ");
        System.out.println(myMap.get("478-0-61159-424-8"));

        // Print whether there is an associated value with key 978-1-60309-453-5 or not
        System.out.println();
        System.out.println("Print value to ISBN 978-1-60309-453-5: ");
        System.out.println(myMap.get("978-1-60309-453-5"));





    }
}
