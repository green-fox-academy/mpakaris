package Animals;

public class Reptile extends Animal {

    protected String name;

    public Reptile(String name) {
        super(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String move() {
        return " creeping.";
    }

    @Override
    public String sound() {
        return "roars.";
    }

    @Override
    public String breed() {
        return "by laying eggs.";
    }

    @Override
    public int setNumberOfLegs() {
        return 4;
    }

    @Override
    public String getCountryOfOrigin() {
        return " in Brazil.";
    }

    @Override
    public String color() {
        return "green.";
    }
}
