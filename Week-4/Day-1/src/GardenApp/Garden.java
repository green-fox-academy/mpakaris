package GardenApp;

import java.util.ArrayList;
import java.util.Arrays;

public class Garden {

    ArrayList<Plant> garden;

    public Garden(){
        this.garden = new ArrayList<Plant>();
    }

    public void add(Plant plantToAdd){
        this.garden.add(plantToAdd);
    }

    public void getGardenStatus(){
        System.out.println("The status of the plants in this garden are: ");
        for (Plant plant : this.garden) {
            if (plant instanceof Tree){
                System.out.println("The " + plant.getColor() + " " + plant.getType()
                + " " + (plant.evaluateNeedOfWatering() ? "need " : "doesnt need ") + "water");
            } else if (plant instanceof Flower) {
                System.out.println("The " + plant.getColor() + " " + plant.getType()
                        + " " + (plant.evaluateNeedOfWatering() ? "need " : "doesnt need ") + "water");
            }
        }
    }

    public void wateringGarden(int waterAmount){
        System.out.println("Watering with Amount of " + waterAmount);
        int amountOfWaterPerPlant = waterAmount / countAmountOfPlantsToWater();
        double newWaterLevel = 0;
        for (Plant plant : this.garden) {
            if (plant instanceof Tree && plant.evaluateNeedOfWatering()){
                newWaterLevel = plant.getWaterLevel() + (amountOfWaterPerPlant*0.4);
                plant.setWaterLevel(newWaterLevel);
            } else if (plant instanceof Flower && plant.evaluateNeedOfWatering()){
                newWaterLevel = plant.getWaterLevel() + (amountOfWaterPerPlant*0.75);
                plant.setWaterLevel(newWaterLevel);
            }
        }
    }

    public int countAmountOfPlantsToWater(){
        int counter = 0;
        for (Plant plant : this.garden) {
            if (plant.evaluateNeedOfWatering()){
                counter++;
            }
        }
        return counter;
    }



}
