import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        System.out.println();
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number and we will calculate the sum till this number: ");
        int input = scanner.nextInt();
        int sumOfNumbers = sum(input);

        System.out.println("The sum of all numbers till "+input+ " is: " +sumOfNumbers);
    }
    public static int sum(int a) {
        int result = 0;

        for (int i = 0; i <= a; i++) {
            result = result + i;
        }

        return result;
    }
}
