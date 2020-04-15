package AnimalProtection;
import java.util.Random;

public class Parrot extends Animal{

    public Parrot() {
        super("Parrot", generateRandomNumber());
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(11) + 4;
    }
}
