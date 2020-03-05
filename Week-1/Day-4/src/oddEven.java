import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0 ) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
