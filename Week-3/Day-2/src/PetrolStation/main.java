package PetrolStation;

public class main {
    public static void main(String[] args) {

    Station gasStation = new Station(1000);
    Car car = new Car(0, 100);

    //Fill Car for x-Times:

        for (int i = 0; i <9 ; i++) {
            gasStation.refill(car);
        }


    }
}
