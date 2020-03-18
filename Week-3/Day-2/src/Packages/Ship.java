package Packages;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ship {

    ArrayList<Pirates> pirateShip = new ArrayList<>();
    public String nameOfShip;

    public Ship(String nameOfShipMain){
        this.nameOfShip = nameOfShipMain;
    }

    public void fillship(Pirates nameOfCaptain) {
        // Create random Number for Crew-Members
        int numberOfCrew = 0;
        while (numberOfCrew == 0) {
            numberOfCrew = (int) Math.floor(Math.random() * 7);
        }
        // Add a Captain to the Ship (captain = true)
        pirateShip.add(nameOfCaptain);
        nameOfCaptain.drinkSomeRum((int) Math.floor(Math.random() * 7));

        System.out.println();
        // Add Crew Members to the Ship (captain = false)
        for (int i =1; i <= numberOfCrew; i++) {
            String pirateName = nameOfShip + " Pirate" + i; // e.g. Pirate1, Pirate2, Pirate3
            Pirates pirate = new Pirates(pirateName);
            pirateShip.add(pirate);
            pirate.drinkSomeRum((int) Math.floor(Math.random() * 7)); // assings a random amount of Rum to the Pirate
        }
        for (Pirates line : pirateShip) {
            System.out.println(line.nameOfPirate);
        }
        System.out.println();
    }

    public void informAboutShip(){

        System.out.println("Information about the Ship Crew: ");
        System.out.println("-----");
        for (Pirates line : pirateShip) {
            System.out.println("Name of Pirate: " + line.nameOfPirate);
            System.out.println("Bottles of Rum drank: " + line.counterOfRum);
            System.out.println(line.nameOfPirate + " is alive: " + line.alivePirate);
            System.out.println();

        }
    }

    public boolean battle(Ship nameOfShipToBattle){

        boolean winnerOfTheBattle = false;

    int actualShipScore = 0;
    int shipToBattleScore = 0;
    int alivePiratesActualShip = 0;
    int alivePiratesBattleShip = 0;

        for (Pirates line : pirateShip) {
            if (line.alivePirate){
                alivePiratesActualShip++;
            }
        }

        for (Pirates line: nameOfShipToBattle.pirateShip) {
            if (line.alivePirate){
                alivePiratesBattleShip++;
            }
        }

       actualShipScore = alivePiratesActualShip - pirateShip.get(0).counterOfRum;
        shipToBattleScore = alivePiratesBattleShip - nameOfShipToBattle.pirateShip.get(0).counterOfRum;

        if (actualShipScore > shipToBattleScore) {
            System.out.println("Ship 1 wins!");
            winnerOfTheBattle = true;
        } else {
            System.out.println("Ship 2 wins!");
        }

    // Kill randomly the Losers of the Battle --> Send "an Array of Pirates" / the Crew into the next function
        if (winnerOfTheBattle) {
            killTheLoserCrewRandomly(nameOfShipToBattle.pirateShip);
            theWinningShipParties(pirateShip);
        } else {
            killTheLoserCrewRandomly(pirateShip);
            theWinningShipParties(nameOfShipToBattle.pirateShip);
        }

        return winnerOfTheBattle;
    }

    public void killTheLoserCrewRandomly(ArrayList<Pirates> crew ){

        System.out.println("The Losership deserves punishment!");
        int counter = 0;
        for (Pirates line : crew) {

            int randomNumber = (int) Math.floor(Math.random() * 10);
            if (randomNumber % 2 == 0)
                line.alivePirate = false;
                counter++;
        }
        System.out.println("The loser ship lost " + counter + " crew Members");
    }

    public void theWinningShipParties(ArrayList<Pirates> crew) {

        System.out.println("Let the Party begin for the WinnerShip! Rum for everyone!!");
        for (Pirates pirate : crew) {
            pirate.drinkSomeRum((int) Math.floor(Math.random() * 7));
        }


    }

}
