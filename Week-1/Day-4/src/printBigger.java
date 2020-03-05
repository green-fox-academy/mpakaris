import java.util.Scanner;

public class printBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Bigger number is: " + num2);
        } else {
            System.out.println("Bigger number is: " + num1);
        }


    }
}
