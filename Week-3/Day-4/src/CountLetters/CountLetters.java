package CountLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public CountLetters(){
    }

    public HashMap<Character, Integer> countCharactersInString(String wordToCount){
        // Create HashMap
        HashMap<Character, Integer> charactersInString = new HashMap();
        // Turn String to Charakter-Array
        char[] arrayOfCharacter = new char[wordToCount.length()];
        for (int i = 0; i < wordToCount.length(); i++) {
            arrayOfCharacter[i] = wordToCount.charAt(i);
        }
        // Go through char-Array and check each Character with the other one in the Array
        for (int i = 0; i < arrayOfCharacter.length; i++) {
            int counter = 0;
            for (int j = 0; j < arrayOfCharacter.length; j++) {
                    if (arrayOfCharacter[i] == arrayOfCharacter[j]) {
                    counter++;
                }
            }
            // Write into HashMap
            charactersInString.put(arrayOfCharacter[i], counter);
        }
        //Check with Printing if HashMap is ok:
        System.out.println("HashMap");
        for (Map.Entry<Character, Integer> item : charactersInString.entrySet()) {
            System.out.println("Key : " + item.getKey() + " / Value: " + item.getValue());
        }
        return charactersInString;
    }

    public static void main(String[] args) {
        CountLetters countLetters = new CountLetters();
        String wordToCount = "MISSISSIPPI";
        countLetters.countCharactersInString(wordToCount);
    }
}
