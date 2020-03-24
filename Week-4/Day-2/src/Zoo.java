import Animals.*;

public class Zoo {
    public static void main(String[] args) {
        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding " + bird.breed());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("How do you move?");
        System.out.println("A " + reptile.getName() + " is" + reptile.move());
        System.out.println("A " + mammal.getName() + " is" + mammal.move());
        System.out.println("A " + bird.getName() + " is" + bird.move());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("How do you sound?");
        System.out.println("A " + reptile.getName() + " " + reptile.sound());
        System.out.println("A " + mammal.getName() + " has" + mammal.sound());
        System.out.println("A " + bird.getName() + " " + bird.sound());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("How many legs do you have?");
        System.out.println("A " + reptile.getName() + " has " + reptile.setNumberOfLegs() + " legs.");
        System.out.println("A " + mammal.getName() + " has " + mammal.setNumberOfLegs() + " legs.");
        System.out.println("A " + bird.getName() + " has " + bird.setNumberOfLegs() + " legs.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Flyable Exercise Add-On:");
        bird.takeOff();
        bird.land();
        bird.fly();
    }
}
