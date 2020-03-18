package Packages;

public class Main {
    public static void main(String[] args) {

    Pirates pirate1 = new Pirates("Raphael BlackBeard");
    Pirates pirate2 = new Pirates("Niko RedBeard");

        // call 1st function
        for (int i = 0; i < 3; i++) {
            pirate1.drinkSomeRum();
        }

        // call 2nd Function:
        System.out.println();
        System.out.println("How is it Going Mate?");
        pirate1.howsItGoingMate();

        // let the Pirate die
        //pirate1.die();
        // give dead Pirate another drink
        pirate1.drinkSomeRum();

        // Pirate1 fights Pirate2
        System.out.println("Here the fight starts: ");
        pirate1.brawl(pirate2);
        System.out.println();

        System.out.println("Give the Pirates some Rum: ");
        pirate1.drinkSomeRum();
        pirate2.drinkSomeRum();


    }
}
