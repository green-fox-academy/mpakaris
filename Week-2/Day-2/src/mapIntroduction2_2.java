import java.util.HashMap;
import java.util.Map;

public class mapIntroduction2_2 {
    public static void main(String[] args) {

        HashMap<String, String> myMap = new HashMap<>();

        myMap.put("978-1-60309-452-8", "A letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry<String, String> line : myMap.entrySet()) {
            System.out.println(line.getValue() + " (ISBN: " + line.getKey() + ")");
        }

        // Remove 978-1-60309-444-3
        System.out.println("Remove: ");
        myMap.remove("978-1-60309-444-3");
        System.out.println(myMap);

        for (Map.Entry<String, String> line : myMap.entrySet()) {

            if (line.getValue() == "The Lab"){
                myMap.remove("978-1-60309-461-0");
            }
        }
        System.out.println("After the Lab");
        System.out.println(myMap);





    }
}
