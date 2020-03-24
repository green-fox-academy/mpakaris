package Flyable;

public class Helicopter extends Vehicle implements Flyable{
    public Helicopter(String name, String type, int doors) {
        super(name, type, doors);
    }

    @Override
    public void land() {
        System.out.println("Helicopters can land almost anywhere.");
    }

    @Override
    public void fly() {
        System.out.println("Helicopters need Rotors in order to fly");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopters take off from anywhere.");
    }
}
