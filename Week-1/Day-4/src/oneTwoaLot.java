import java.util.Scanner;

public class oneTwoaLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Too small number!");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else {
            System.out.println("This number is too big!");
        }
    }



}
