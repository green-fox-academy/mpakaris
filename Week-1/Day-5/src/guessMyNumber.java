import java.util.Scanner;
import java.util.Random;

public class guessMyNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt();

        while (randomNumber < 1 || randomNumber > 100) {
            randomNumber = random.nextInt();
        }
        // by now a will have a random number betwween 1 and 10

        System.out.println();
        System.out.println("We have saved a random number between 1 and 100! Your task is to guess it. Good luck!");

        int lives = 5;

        while ( 0 < lives) {

            System.out.println("You have " + lives + " lives left. Please guess: ");
            int guess = scanner.nextInt();

                if (guess > randomNumber) {
                    lives--;
                    System.out.println("Sorry, the number we look for is smaller!");

                    if (lives == 0) {
                        System.out.println("Sorry, you couldn't find the answer within the alloted time.");
                        System.out.println("We re looking for: " + randomNumber);
                        lives = 0;
                    }
                } else if (guess < randomNumber) {
                    lives--;
                    System.out.println("Sorry, the number we look for is bigger!");
                    if (lives == 0) {
                        System.out.println("Sorry, you couldnt find the answer within the alloted time.");
                        System.out.println("We re looking for: " + randomNumber);
                        lives = 0;
                    }
                } else if (guess == randomNumber) {
                    System.out.println("Congratulations, you figured it out!");
                    lives = 0;
                }
        }


        System.out.println("Thank you for playing with MPAK Entertainment!");

    }
}


