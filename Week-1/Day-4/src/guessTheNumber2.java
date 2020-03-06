import java.util.Scanner;
import java.util.Random;

public class guessTheNumber2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt();
        while (randomNumber < 1 || randomNumber >10) {
            randomNumber = random.nextInt();
        }
        // by now a will have a random number betwween 1 and 10

        System.out.println("We have saved a random number between 1 and 10! Your task is to guess it. Good luck!");

        int guessedNumber = scanner.nextInt();

        while (guessedNumber != randomNumber) {
            if (guessedNumber < randomNumber) {
                System.out.println("The stored number is bigger!");
            } else if (guessedNumber > randomNumber) {
                System.out.println("The storid number is smaller!");
            }
            System.out.println("Please try again!: ");
            guessedNumber = scanner.nextInt();
        }

        System.out.println("Congratulations! The stored number was: " + randomNumber);
        }



    }

