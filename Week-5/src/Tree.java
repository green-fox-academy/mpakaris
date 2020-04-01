public class Tree extends Plant {
    public Tree(String color) {
        super("Tree", color);
    }

    @Override
    public void plantNeedsWater() {
        if (super.getWaterUnits() < 10) {
            super.setNeedsWater(true);
        } else {
            super.setNeedsWater(false);
        }
    }

    @Override
    public void giveWaterToPlants(int waterAmount, int amountPlants) {
        double amountWaterPerPlant = (waterAmount/amountPlants)*0.4;
        super.setWaterUnits(amountWaterPerPlant);
    }
}