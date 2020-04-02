package TestExercises;

import java.util.Arrays;
import java.util.List;

public class Extension {
    public int add(int a, int b) {
        return a+b;
    }

    public int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public int median(List<Integer> pool) {
        int sum = 0;
        for (Integer item : pool) {
            sum += item;
        }
        return sum/pool.size();
    }

    public boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    public String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed