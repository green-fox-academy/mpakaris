package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        F16 f16 = new F16("F16");
        System.out.println(f16.getType());
        int remaining = f16.refill(1000);
        System.out.println(remaining);
        int damage = f16.fight();
        System.out.println(damage);

        F35 f35 = new F35("F35");
        System.out.println(f35.getType());
        remaining = f35.refill(300);
        System.out.println(remaining);
        damage = f35.fight();
        f35.refill(6);
        f35.fight();
        System.out.println(damage);

        System.out.println("F16");
        System.out.println("-----");
        f16.getStatus();
        System.out.println("F35");
        System.out.println("-----");
        f35.getStatus();

    }
}

