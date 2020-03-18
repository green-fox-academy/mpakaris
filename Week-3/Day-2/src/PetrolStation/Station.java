package PetrolStation;

public class Station {

    int gasAmountOfStation;

    public Station(int gasAmountOfStation){

        this.gasAmountOfStation = gasAmountOfStation;
    }

    public void refill(Car car){

        this.gasAmountOfStation -= car.capacityofCar;
        System.out.println("The car is refilled: " + car.capacityofCar);
        System.out.println("The Gas in the Station left is: " + gasAmountOfStation);

        if (gasAmountOfStation < 200)
            warnWithMessage(gasAmountOfStation);
    }

    public void warnWithMessage(int gasAmountOfStation){

        System.out.println("The Gas in the Station left is dangerously low!!");
    }






}
