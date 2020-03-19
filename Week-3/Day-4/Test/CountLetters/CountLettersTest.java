package CountLetters;

import org.junit.Test;

import java.util.HashMap;
import java.util.zip.CheckedOutputStream;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countCharactersInString() {
        CountLetters countLetters = new CountLetters();
        String wordToCheck = "MISSISSIPPI";
        HashMap<Character, Integer> hashMapExpected = new HashMap<>();
        hashMapExpected.put('M', 1);
        hashMapExpected.put('I', 4);
        hashMapExpected.put('S', 4);
        hashMapExpected.put('P', 2);

       assertEquals(hashMapExpected, countLetters.countCharactersInString(wordToCheck));
    }
}