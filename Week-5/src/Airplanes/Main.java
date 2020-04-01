package Airplanes;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Carrier carrier = new Carrier("1", 1000, 1000);
        Carrier carrierEnemy = new Carrier("2", 1000, 5000);

       createRandomAmountOfJets(carrier);
       createRandomAmountOfJets(carrierEnemy);
        System.out.println();
        printAirplanesInCarrier(carrier);
        System.out.println();
        printAirplanesInCarrier(carrierEnemy);
        carrier.fill();
        carrierEnemy.fill();
        System.out.println();
        carrier.fight(carrierEnemy);
        carrier.getStatus();
        System.out.println();
        carrierEnemy.getStatus();
    }

    public static void printAirplanesInCarrier(Carrier carrier) {
        System.out.println("Airplanes in Carrier: ");
        System.out.println("-----------------------------------------------");
        for (Airplane jet : carrier.getCarrier()) {
            jet.getStatus();
        }
    }

    public static void createRandomAmountOfJets(Carrier carrier) {
        Random random = new Random();
        int jetF16 = random.nextInt(5) + 1;
        for (int i = 0; i < jetF16; i++) {
            carrier.add(new F16());
        }
        int jetF35 = random.nextInt(3) + 1;
        for (int i = 0; i < jetF35; i++) {
            carrier.add(new F35());
        }
    }


}
