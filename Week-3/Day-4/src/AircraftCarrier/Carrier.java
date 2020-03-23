package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

    public String nameCarrier = "HP 5000";
    public int nameAddition = 0;
    public int storedAmmo = 0;
    public int healthPoints = 0;
    public int damageCaused = 0;
    public int ammoNeededToRefillCarrier = 0;
    public boolean alive = true;
    public int amountOfAircraftOnCarrier = 0;
    public ArrayList<Aircraft> carrier = new ArrayList<>();

    public Carrier(int initialAmmoGiven, int healthPointsGiven){
        this.nameAddition = initialAmmoGiven;
        this.storedAmmo = initialAmmoGiven;
        this.healthPoints = healthPointsGiven;
        System.out.println("A new Carrier was created.");
        System.out.println("---------------");
    }

    public void add(Aircraft aircraftToStore){
        carrier.add(aircraftToStore);
        System.out.println("Aircraft " + aircraftToStore.aircraftTypeName +  " was added to Carrier.");
        System.out.println("---------------");
    }

    public void carrierStatus(){
        //Amount of Aircraft:
        //System.out.println("Aircraft in the Carrier: ");
        for (Aircraft aircraft : carrier) {
            System.out.println("Aircraft: " + aircraft.aircraftTypeName);
            this.amountOfAircraftOnCarrier++;
        }
    }

    public void getStatus(){
        System.out.println();
        carrierStatus();
        System.out.println(nameCarrier + ", Aircrafts on Carrier: " + this.amountOfAircraftOnCarrier +
                ", Ammo Storage: " + this.nameAddition + ", Total damage: " + this.damageCaused);
        System.out.println("Aircrafts: ");
        for (Aircraft aircraft : carrier) {
            if (aircraft.aircraftType16){
                System.out.println("Type: " + aircraft.aircraftTypeName + ", Ammo: " + aircraft.ammoMax16 + ", Base Damage: " + aircraft.baseDamage16  + ", All Damage: 240");
            } else if (aircraft.aircraftType35){
                System.out.println("Type: " + aircraft.aircraftTypeName + ", Ammo: " + aircraft.ammoMax35 + ", Base Damage: " +  aircraft.baseDamage35+ ", All Damage: 600");

            }
        }
        System.out.println("---------------");
    }

    public void fill(){
        countNeededAmmo();
        System.out.println("Needed Ammo for Carrier: " + this.ammoNeededToRefillCarrier);
        System.out.println("Ammo on Carrier: " + this.storedAmmo);
        System.out.println("--------------");

        if(this.storedAmmo == 0){
            System.out.println("S.O.S. - Carrier ran out of Ammonition!");
        } else if (this.ammoNeededToRefillCarrier > this.storedAmmo && this.storedAmmo != 0){
            for (Aircraft aircraft : carrier) {
                if (aircraft.priority) {
                    aircraft.refill(this.storedAmmo);
                    this.storedAmmo -= aircraft.ammoCounter;
                    System.out.println("- " + aircraft.aircraftTypeName + " was refilled: " + aircraft.ammoCounter + " ammo.");
                    System.out.println("- The Carrier has " + this.storedAmmo + " stored ammo left.");
                    System.out.println();
                }
            }
            for (Aircraft aircraft : carrier){
                    if (!aircraft.priority){
                        aircraft.refill(this.storedAmmo);
                        this.storedAmmo -= aircraft.ammoCounter;
                        System.out.println("- " + aircraft.aircraftTypeName + " was refilled: " + aircraft.ammoCounter + " ammo.");
                        System.out.println("- The Carrier has " + this.storedAmmo + " stored ammo left.");
                        System.out.println();
                    }
                }
            } else {
                for (Aircraft aircraft : carrier) {
                    aircraft.refill(500);
                    int amountRefilled = aircraft.ammoRefilled;
                    this.storedAmmo -= aircraft.ammoCounter;
                    System.out.println("- " + aircraft.aircraftTypeName + " was refilled: " + aircraft.ammoCounter + " ammo.");
                    System.out.println("- The Carrier has " + this.storedAmmo + " stored ammo left.");
                    System.out.println();
            }
        }
    }

    public void countNeededAmmo(){
        for (Aircraft aircraft : carrier) {
            if(aircraft.aircraftType16) {
                this.ammoNeededToRefillCarrier += aircraft.ammoMax16 - aircraft.ammoStorage16;
            }else if (aircraft.aircraftType35){
                this.ammoNeededToRefillCarrier += aircraft.ammoMax35 - aircraft.ammoStorage35;
            }
        }
        // System.out.println("Ammo needed to Refill all Aircrafts on Carrier: " + this.ammoNeededToRefillCarrier);
    }

    public void fight(Carrier carrierToFight){
        System.out.println();
        System.out.println("An attack was made.");
        int firepower = 0;
        for (Aircraft aircraft : carrier) {
            if(aircraft.aircraftType16){
                firepower = firepower + (aircraft.ammoStorage16*aircraft.baseDamage16);
            } else if(aircraft.aircraftType35){
                firepower = firepower + (aircraft.ammoStorage35*aircraft.baseDamage35);
            }
        }
        this.damageCaused += firepower;
        carrierToFight.substractHealthPoints(firepower);
    }

    public void substractHealthPoints(int fireTaken){
        this.healthPoints -= fireTaken;
        if (this.healthPoints <= 0) {
            this.alive = false;
            System.out.println("The carrier was hit heavy. Now its dead.");
        } else {
            System.out.println("The health points of the attacked ship are: " + this.healthPoints);
        }
    }
}
