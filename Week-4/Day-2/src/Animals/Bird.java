package Animals;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {

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

    @Override
    public void land() {
        System.out.println("The bird lands smooth and soft");
    }

    @Override
    public void fly() {
        System.out.println("The birds loves to fly high.");
    }

    @Override
    public void takeOff() {
        System.out.println("The bird can take-off in an instant.");
    }
}
