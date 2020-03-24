package Animals;

public class Bird extends Animal{

    protected String name;

    public Bird(String name){
        super(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String move() {
        return " flying.";
    }

    @Override
    public String sound() {
        return " twitters.";
    }

    @Override
    public String breed() {
        return "by laying eggs.";
    }

    @Override
    public int setNumberOfLegs() {
        return 2;
    }

    @Override
    public String getCountryOfOrigin() {
        return " all over the Planet Earth";
    }

    @Override
    public String color() {
        return " a wide variaty of any possible color.";
    }
}
