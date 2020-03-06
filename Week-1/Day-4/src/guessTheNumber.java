import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {

        System.out.println("Please be patient. Java generats a random number for you!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int counter =1;
        int a = random.nextInt();

        while (a <= 1 || a >=10) {
            a = random.nextInt();
        }

        // by now a will have a random number betwween 1 and 10

        System.out.println("We have saved a random number between 1 and 107! Your task is to guess it. Good luck!");
        System.out.println("Please try to guess the randomly generated number: ");

        int guessedNumber = scanner.nextInt();

        while (guessedNumber != a) {
            System.out.println("Wrong guess. Please try again: ");
            guessedNumber = scanner.nextInt();
            counter++;
        }

        if (guessedNumber == a) {
            System.out.println( "Congratulations! The guessed number was: " + a);
            System.out.println("you guessed only: " + counter + " times!");
        }
    }
}





        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8
