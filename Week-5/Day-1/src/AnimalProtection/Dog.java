package AnimalProtection;
import java.util.Random;

public class Dog extends Animal{

    public Dog() {
        super("Dog", generateRandomNumber());
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
