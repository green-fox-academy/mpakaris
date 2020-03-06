import java.util.Scanner;
import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Enter a word: ");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverse = "";

       // System.out.println(word);
        int length = word.length();

        for (int i= length-1; i>=0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println();
        System.out.println("The Palindom is: ");
        System.out.println(reverse);
        System.out.println();
        System.out.println("The exercise asks for: "+word+reverse);
    }
}
