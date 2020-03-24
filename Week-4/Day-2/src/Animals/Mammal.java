package Animals;

public class Mammal extends Animal {

    protected String name;

    public Mammal(String name){
        super(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String move() {
        return " walking.";
    }

    @Override
    public String sound() {
        return " a variety of sounds.";
    }

    @Override
    public String breed() {
        return "by making little clones of itself.";
    }

    @Override
    public int setNumberOfLegs() {
        return 4;
    }

    @Override
    public String getCountryOfOrigin() {
        return " all over Planet Earth";
    }

    @Override
    public String color() {
        return " a wide variaty of any possible color.";
    }
}
