import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("The palindrome is: " + word + palindromeBuilder(word));
    }

    public static String palindromeBuilder(String inputWordFromMain){

        String palindrome = "";

        for (int i = inputWordFromMain.length()-1; i >= 0; i--) {
            palindrome = palindrome + inputWordFromMain.charAt(i);
        }

        return palindrome;
    }
}
