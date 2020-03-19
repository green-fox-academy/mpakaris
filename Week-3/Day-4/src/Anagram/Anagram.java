package Anagram;

import java.util.Arrays;

public class Anagram {

    public Anagram(){
    }

    public boolean checksForAnagram(String givenWord1, String givenWord2){
        boolean anagram = false;
        char charArray1[] = givenWord1.toCharArray();
        char charArray2[] = givenWord2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2)) {
            return anagram = true;
        }
        return anagram = false;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        boolean answer = false;
        answer = anagram.checksForAnagram("puski", "nikos");
       if (answer){
           System.out.println("YES ANAGRAM");
       }
       else{
           System.out.println("NO ANAGRAM");
       }
    }
}



