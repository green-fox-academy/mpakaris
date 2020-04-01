public class GardenApp {

    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant blueFlower = new Flower("blue");
        garden.addToGarden(blueFlower);
        Plant yellowFlower = new Flower("yellow");
        garden.addToGarden(yellowFlower);
        Plant purpleTree = new Tree("purple");
        garden.addToGarden(purpleTree);
        Plant orangeTree = new Tree("orange");
        garden.addToGarden(orangeTree);
        showStatusOfPlants(garden);
        waterPlants(40, garden);
        waterPlants(70, garden);
    }

    public static void showStatusOfPlants(Garden garden) {
        for (Plant plant: garden.getGardenList()) {
            plant.givesStatusOfPlant();
        }
    }

    public static void waterPlants(int amountWater, Garden garden) {
        int plantsToWater = countPlantsToWater(garden);
        int amountOfWater = amountWater;
        shoutOutLoud(amountOfWater);
        for (Plant plant : garden.getGardenList()) {
            plant.giveWaterToPlants(amountOfWater,plantsToWater );
            plant.givesStatusOfPlant();
        }
    }

    public static int countPlantsToWater(Garden garden) {
        int plantsToWater=0;
        for (Plant plant : garden.getGardenList()) {
            if (plant.isNeedsWater()) {
                plantsToWater++;
            }
        }
        return plantsToWater;
    }

    public static void shoutOutLoud(int amountOfWater) {
        System.out.println();
        System.out.println("Watering with: " + amountOfWater);
        System.out.println("--------------------------------");
    }
}
