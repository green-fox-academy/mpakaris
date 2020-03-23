package AircraftCarrier;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println();
        // Carrier 1:
        Carrier newCarrier = new Carrier(500, 1000);
        System.out.println();
        Aircraft carrier1_f16 = new Aircraft(1);
        newCarrier.add(carrier1_f16);
        Aircraft carrier1_f35 = new Aircraft(2);
        newCarrier.add(carrier1_f35);
        Aircraft carrier1_f35_2 = new Aircraft(2);
        newCarrier.add(carrier1_f35_2);
        newCarrier.fill();

        // Carrier 2:
        Carrier newCarrier2 = new Carrier(5000, 100);
        System.out.println();
        System.out.println();
        Aircraft carrier2_f16 = new Aircraft(1);
        newCarrier2.add(carrier2_f16);
        Aircraft carrier2_f35 = new Aircraft(2);
        newCarrier2.add(carrier2_f35);
        Aircraft carrier2_f35_2 = new Aircraft(2);
        newCarrier2.add(carrier2_f35_2);
        newCarrier2.fill();

        //Carrier_1 attacks Carrier_2:
        //newCarrier.fight(newCarrier2);

        //getStatus
        newCarrier.getStatus();
        newCarrier2.getStatus();
    }
}
