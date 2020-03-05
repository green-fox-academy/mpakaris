import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // String userInput1 = scanner.nextLine();
        // System.out.println(userInput1);
        // int userInput2 = scanner.nextInt();
        // System.out.println(userInput2);

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Name below: ");

        String userName = scanner.nextLine();  // reads and saves UserName
        System.out.println("Hello, " + userName); // prints userName



    }
}
