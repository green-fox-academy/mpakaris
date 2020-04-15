package AnimalProtection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {

    private int budget;
    private List<Animal> listWithAnimals;
    private List<String> listNameOfAdopters;

    public Shelter() {
        this.budget = 50;
        this.listWithAnimals = new ArrayList<>();
        this.listNameOfAdopters = new ArrayList<>();
    }

    public void rescue(Animal animalToAdd) {
        listWithAnimals.add(animalToAdd);
    }

    public void addAdopter(String nameAdopter) {
        listNameOfAdopters.add(nameAdopter);
    }

    public int rescue() {
        int counter=0;
        for (Animal animal : listWithAnimals) {
            if (!animal.isHealthy() && this.budget > animal.getHealCost()) {
                animal.heal();
                counter++;
                break;
            }
        }
        return counter;
    }

    public void findNewOwner() {
       if (listNameOfAdopters.size() > 0 && listWithAnimals.size() > 0) {
           int indexAnimal = generateRandomNumber(listWithAnimals.size());
           listWithAnimals.remove(indexAnimal);
           int indexOwners = generateRandomNumber(listNameOfAdopters.size());
           listNameOfAdopters.remove(indexOwners);
       }
    }

    private int generateRandomNumber(int maxLimit) {
        Random random = new Random();
        return random.nextInt(maxLimit+1);
    }

    public int earnDonation(int amount) {
        return this.budget += amount;
    }

    @Override
    public String toString() {
        System.out.println("Budget: " + this.budget + "€," + "\n" + "There are " + listWithAnimals.size() + " animal(s) and " + listNameOfAdopters.size() + " potential adopter(s) \n");
        for (Animal animal : listWithAnimals) {
            animal.toString();
        }
        return null;
    }

}
