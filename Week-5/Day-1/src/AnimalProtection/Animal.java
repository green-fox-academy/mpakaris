package AnimalProtection;

import java.util.Random;

public class Animal {

    private String animalName, ownerName;
    private int healCost;
    private boolean isHealthy, isAdoptable;

    public Animal(String animalName, int healCost) {
       this.animalName = animalName;
       this.healCost = healCost;
    }

    public void heal() {
        this.isHealthy = true;
    }

    public boolean isAdoptable() {
        if(this.isHealthy) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return (this.animalName + " is " + (isHealthy ? "healthy and adoptable" : "not healthy (" + this.healCost + "€) and not adoptable"));
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getHealCost() {
        return healCost;
    }
}
