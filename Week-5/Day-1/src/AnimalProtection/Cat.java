package AnimalProtection;

import java.util.Random;

public class Cat extends Animal {

    public Cat() {
        super("Cat", generateRandomNumber());
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(7);
    }
}
