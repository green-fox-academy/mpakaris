import java.util.Scanner;

public class partIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
        System.out.println("Party Indicator");
        System.out.println("Please type the number of Girls coming to the party: ");
        int girls = scanner.nextInt();
        System.out.println("Please type the number of Boys coming to the party: ");
        int boys = scanner.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party!");
        } else if (girls + boys < 20) {
            System.out.println("Average party.");
        } else if (girls + boys >= 20 && girls == boys) {
            System.out.println("Excellent party!");
        } else if (girls != boys && boys + girls >= 20) {
            System.out.println("Quite ok, could be better");
        }





    }
}
