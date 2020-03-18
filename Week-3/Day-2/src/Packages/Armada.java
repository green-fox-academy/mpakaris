package Packages;

import java.util.ArrayList;
import java.util.Arrays;

public class Armada {

    public String nameArmada;
    ArrayList<Ship> armada = new ArrayList<>();

    public Armada(String nameArmadaMain){
        this.nameArmada = nameArmadaMain;
    }

    public void createArmada(){

        // Creates an Armada with random amount of Ships
        int randomAmountOfShips = 0;
        while (randomAmountOfShips <= 1 ) {
            randomAmountOfShips = (int) Math.floor(Math.random() * 6);;
        }

        System.out.println("This Armada has " + randomAmountOfShips + " ships");
        for (int i = 1; i <= randomAmountOfShips; i++) {
            // Creates a Shipname and a Ship Object
            String nameOfShipofArmada = "+ "+ this.nameArmada + " Ship "+i;
            Ship ship = new Ship(nameOfShipofArmada);
            // Creates a Captain Object for each Ship
            String captain = "Captain " + i;
            Pirates pirate = new Pirates(captain, true);
            //fiils the Ship with random amount of Pirates
            ship.fillship(pirate);
            // adds the Ship (+ Captain) to the Armada
            armada.add(ship);
        }
    }



}
