public abstract class Plant {

    private String type, color, name;
    private double waterUnits;
    private boolean needsWater;

    public Plant(String type, String color) {
        this.type = type;
        this.color = color;
        this.waterUnits = 0;
        plantNeedsWater();
        this.name = this.color + " " + this.type;
    }

    abstract public void plantNeedsWater();

    public double getWaterUnits() {
        return waterUnits;
    }

    public void setWaterUnits(double waterUnits) {
        this.waterUnits += waterUnits;
        plantNeedsWater();
    }

    public boolean isNeedsWater() {
        return needsWater;
    }

    public void setNeedsWater(boolean needsWater) {
        this.needsWater = needsWater;
    }

    public void givesStatusOfPlant() {
        System.out.println("The " + this.name + ((this.needsWater) ? " does " : " does not ") + "need water");
    }

    public abstract void giveWaterToPlants(int waterAmount, int amountPlants);
}
