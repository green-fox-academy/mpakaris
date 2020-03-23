package GardenApp;

public class Plant {

    protected String color;
    private double waterLevel;
    private String type;
    private double waterEffectiveness;

    public Plant(String type, String color, double waterLevel){
        this.color = color;
        this.waterLevel = waterLevel;
        this.type = type;
    }

    public boolean evaluateNeedOfWatering(){
        if(this.type.equals("Flower") && this.waterLevel < 5){
            return true;
        } else if (this.type.equals("Tree") && this.waterLevel <10){
            return true;
        } else {
            return false;
        }
    }

    public String getColor() {
        return color;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWaterEffectiveness() {
        if (this.type.equals("Flower")){
            this.waterEffectiveness = 0.75;
        } else if (this.type.equals("Tree")){
            this.waterEffectiveness = 0.4;
        }
        return waterEffectiveness;
    }
}
