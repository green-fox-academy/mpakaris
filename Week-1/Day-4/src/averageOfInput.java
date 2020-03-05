
import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give number 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Please give number 2: ");
        int n2 = scanner.nextInt();
        System.out.println("Please give number 3: ");
        int n3 = scanner.nextInt();
        System.out.println("Please give number 4: ");
        int n4 = scanner.nextInt();
        System.out.println("Please give number 5: ");
        int n5 = scanner.nextInt();

        int sum=n1+n2+n3+n4+n5;
        double average = (double) sum/5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
