import java.util.Scanner;

public class milesToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter below the Miles you want to convert into km:");

        double milesUser = scanner.nextDouble();
        double kmCalculates = milesUser*1.609344;

        System.out.println("km: " + kmCalculates);
    }
}
