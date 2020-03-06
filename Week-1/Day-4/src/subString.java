import java.util.Scanner;

public class subString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Please type here your Sentence: ");

        String input = scanner.nextLine();
        System.out.println("");

        // System.out.println(input); // Prints Sentence...Testfunction!

        System.out.println();
        System.out.println("Which Word are you looking for?");

        String q = scanner.nextLine();
        // System.out.println(q);  Prints Sentence...Testfunction!

        System.out.println();
        System.out.println("The analysis result of your Sentence revealed: ");
        System.out.println(Substr(input, q));

    }

    static int Substr(String input, String q){

        return input.indexOf(q);

    }
}
