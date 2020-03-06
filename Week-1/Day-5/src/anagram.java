import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter your first word: ");

        String word1 = scanner.nextLine();
        System.out.println("");

        System.out.println("Enter your second word: ");
        String word2 = scanner.nextLine();
        System.out.println("");

        // Step 1: Check the length of the string!  if length != length --> no Anagram

        int l1= word1.length();
        int l2= word2.length();

        // Step 2: Create Array, sort letters and compare the Arrays!

        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();

        // Create Arrays from String:
        Arrays.sort(a1);
        Arrays.sort(a2);

        // compare Arrays:

        if (l1==l2) {
            for (int i = 0; i < l1; i++) {
                if (a1[i] != a2[i]) {
                    System.out.println("This is no Anagram!");
                    i = l1;
                } else {
                    System.out.println("This IS an Anagram!");
                    break;
                }
            }
        } else System.out.println("This is no Anagram!");
    }
}
