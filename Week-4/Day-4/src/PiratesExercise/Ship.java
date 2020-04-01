package PiratesExercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ship {

    protected ArrayList<Pirate> ship = new ArrayList<>();
    protected int counterPirates = 0;
    protected Random random = new Random();

    public Ship(){
    }

    public void fillShip() {
        // Create a captain:
        Pirate captainOfShip = new Pirate("Captain", true);
        ship.add(captainOfShip);
        // Create random amount of Pirates
        counterPirates = random.nextInt(9);
        for (int i = 1; i <= counterPirates; i++) {
            String nameOfPirate = "Arrrrgh No " + i;
            boolean noCaptain = false;
            Pirate pirate = new Pirate(nameOfPirate, noCaptain);
            ship.add(pirate);
        }
        System.out.println("Success! The ship was filled: ");
        System.out.println("-----------------------");
        for (Pirate pirate : ship) {
            if (pirate.isCaptain){
                System.out.println("Pirate: " + "Consumed Rum: " + pirate.counterRum + ". Captain is " +
                        (pirate.alive ? "alive" : "dead") + " and " + (pirate.passedOut ? "passed out" : "sober"));
            } else {
                System.out.println("Pirate: " + pirate.nameOfPirate + " is " + (pirate.alive ? "alive" : "dead") +
                        " and " + (pirate.passedOut ? "passed out" : "sober"));
            }
        }
    }

    public boolean battleShip(Ship shipToBattle) {
        int scoreShip = 0, scoreShipToBattle = 0;
        int shipRum = 0, shipToBattleRum = 0;
        for (Pirate pirate : this.ship) {
            if (pirate.isCaptain) {
                shipRum = pirate.counterRum;
            }
        }
        for (Pirate pirate2 : shipToBattle.ship) {
            if (pirate2.isCaptain) {
                shipToBattleRum = pirate2.counterRum;
            }
        }
        scoreShip = this.counterPirates - shipRum;
        scoreShipToBattle = shipToBattle.counterPirates - shipToBattleRum;
        // evaluate Winner
        if (scoreShip > scoreShipToBattle) {
            System.out.println("Ship 1 won!");
            return true;
        } else {
            System.out.println("Ship 2 won!");
            return false;
        }
    }
}
