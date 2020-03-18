package Farm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Farm {

    public String farmName;
    public int sizeOfFarm = 5;
    ArrayList<Animal> nikosFarm = new ArrayList<>();

    public Farm(String farmNameMain){
        this.farmName = farmNameMain;
    }

    public void breed(Animal animalObject){

        if (sizeOfFarm > 0) {
            nikosFarm.add(animalObject);
            sizeOfFarm--;
            System.out.println("");
            for (Animal line : nikosFarm) {
                System.out.println(line.animalName);
            }
        } else {
            System.out.println("Sorry, ain't no space no more left");
        }
    }

    public void slaughter(){

        int hungerMin = 100;
        Animal toBeRemoved = null;

        for (Animal line : nikosFarm) {

            if (line.hunger < hungerMin) {
                hungerMin = line.hunger;
                toBeRemoved = line;
            }
        }

        nikosFarm.remove(toBeRemoved);

        System.out.println();
        System.out.println("The " + toBeRemoved.animalName + " was slaughtered. Cause it wasnt hungry enough.");
    }







}
