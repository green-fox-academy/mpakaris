import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            int product = i*number;
            System.out.println(i + " * " + number + " = " + product) ;
        }





    }
}
