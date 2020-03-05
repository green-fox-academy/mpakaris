import java.util.Scanner;

public class AnimalsAndLegs {
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many chicken do you see? ");
            int chicken = scanner.nextInt();
            System.out.println("How many pigs do you see? ");
            int pigs = scanner.nextInt();
            int amountLegs = chicken*2 + pigs*4;
            System.out.println("The amount of legs you see are: " + amountLegs);

        }
    }
