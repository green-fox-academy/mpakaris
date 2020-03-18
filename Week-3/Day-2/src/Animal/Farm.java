package Animal;

import Counter.Counter;

import java.util.ArrayList;

public class Farm {

    int slots = 10;
    ArrayList<String> farmAnimals = new ArrayList<>();

    public Farm(){
    }

    public void breed(String animalName) {

        if (slots > 0) {
            farmAnimals.add(animalName);
            System.out.println("The animal " + animalName + " has been added to the Farmlist.");
        } else {
            System.out.println("Warning: All spots filled!!");
            System.out.println("The animal " + animalName + " was NOT added to the Farmlist!");
            System.out.println("I repeat: Was NOT added to the Farmlist!");
        }
    }


}
