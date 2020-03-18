package Packages;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Pirates pirate1 = new Pirates("Captain Raphael BlackBeard", true);
        Pirates pirate2 = new Pirates("Captain Niko RedBeard", true);
        Ship flyingDutchman = new Ship("Flying Dutchman");
        Ship blackPearl = new Ship("The Black Pearl");

        System.out.println("Ship 1: ");
        System.out.println("---------------------------------------------");
        flyingDutchman.fillship(pirate1);
        flyingDutchman.informAboutShip();

        System.out.println("Ship 2: ");
        System.out.println("---------------------------------------------");
        blackPearl.fillship(pirate2);
        blackPearl.informAboutShip();

        // War-App starts from Here:
        System.out.println("Let the Battle begin!");
        System.out.println("---------------------------------------------");

        flyingDutchman.battle(blackPearl);

        System.out.println("---------------------------------------------");
        flyingDutchman.informAboutShip();
        blackPearl.informAboutShip();

    /*  // call 1st function
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
        pirate2.drinkSomeRum(); */


    }
}
