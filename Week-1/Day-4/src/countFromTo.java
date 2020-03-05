import java.util.Scanner;

public class countFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    // 3
    // 4
    // 5

        System.out.println("First number");
        int n1 = scanner.nextInt();
        System.out.println("Second number");
        int n2 = scanner.nextInt();

        if (n2 > n1 ) {
                for (int i=n1; i<n2; i++) {
                System.out.println(i);
            }}
            else {
                System.out.println("The second number should be bigger!");
            }

        }





    }

