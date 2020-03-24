package Flyable;

public class FlyableMain {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter("KP 500", "HeKo", 4);
        System.out.println();
        helicopter.fly();
        helicopter.takeOff();
        helicopter.land();
    }
}
