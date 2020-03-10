import java.util.HashMap;
import java.util.Map;

public class telephoneBook {
    public static void main(String[] args) {
        System.out.println();

        // Create Telephone HashMap
        HashMap<String, String> myTelephoneBook = new HashMap<>();

        // Entries for Phone Book:
        myTelephoneBook.put("William A. Lathan", "405-709-1865");
        myTelephoneBook.put("John K. Miller", "402-247-8568");
        myTelephoneBook.put("Hortensia E. Foster", "606-481-6467");
        myTelephoneBook.put("Amanda D. Newland", "319-243-5613");
        myTelephoneBook.put("Brooke P. Askew", "307-687-2982");

        // What is John K. Miller's phone number?
        for (String key : myTelephoneBook.keySet()) {
            if (key == "John K. Miller")
                System.out.println("John's phone number is: " + myTelephoneBook.get(key));
            }
        System.out.println();

        // Whose phone number is 307-687-2982?
        for (Map.Entry<String, String> item : myTelephoneBook.entrySet()) {

            if (item.getValue() == "307-687-2982") {
                System.out.println("The phone number 307-687-2982 belongs to : " + item.getKey());
            }
        }
        System.out.println();
        // Do we know Chris E. Myers' phone number?

        boolean nameSearch = false;
        for (String name : myTelephoneBook.keySet()) {
            if (name == "Chris E. Myers")
                nameSearch = true;
        }
        if (!nameSearch)
            System.out.println("Sorry, no entry with Chris E. Myers in our PhoneBook!");
    }
}
