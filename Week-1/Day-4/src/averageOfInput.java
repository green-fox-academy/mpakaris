
import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Please index how many numbers you want to enter: ");

        int amountNumbers = scanner.nextInt();
        int counter = 0;
        int sum = 0;

        while (counter<amountNumbers) {
            counter++;
            System.out.println("Please Enter number " + counter);
            int currentNumber = scanner.nextInt();
            sum = sum + currentNumber;
        }

        double average = (double) sum/amountNumbers;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
