package Anagram;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void checksForAnagram() {
        Anagram checkIfAnagram = new Anagram();
        String wordToCheck1 = "niko";
        String wordToCheck2 = "tata";
        Boolean expectedAnswer = false;
        assertEquals(expectedAnswer, checkIfAnagram.checksForAnagram(wordToCheck1, wordToCheck2));
    }
}