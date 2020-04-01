public class Flower extends Plant {
    public Flower(String color) {
        super("Flower", color);
    }

    @Override
    public void plantNeedsWater() {
        if (super.getWaterUnits() < 5) {
            super.setNeedsWater(true);
        } else {
            super.setNeedsWater(false);
        }
    }

    @Override
    public void giveWaterToPlants(int waterAmount, int amountPlants) {
        double amountWaterPerPlant = (waterAmount/amountPlants)*0.75;
        super.setWaterUnits(amountWaterPerPlant);
    }
}
