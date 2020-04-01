package Airplanes;
import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Airplane> carrier = new ArrayList<>();
    private int ammoStore, healthPoints, totalDamage;
    private String name;

    Carrier(String name, int ammoStore, int healthPoints) {
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public void add(Airplane planeToStore) {
        this.carrier.add(planeToStore);
    }

    public void fill() throws Exception {
        int ammoNeeded = evaluateAmmoNeed();
        if (this.ammoStore == 0) {
            throw new Exception("No Ammo in Carrier!");
        } else if (ammoNeeded > this.ammoStore) {
            for (Airplane jet : this.carrier) {
                if (jet.isPriority()) {
                    this.ammoStore = jet.refill(this.ammoStore);
                }
            }
            if (this.ammoStore > 0) {
                for (Airplane jet : this.carrier) {
                    if (!jet.isPriority()) {
                        this.ammoStore = jet.refill(this.ammoStore);
                    }
                }
            }
        } else {
            for (Airplane jet : this.carrier) {
                this.ammoStore = jet.refill(this.ammoStore);
            }
        }
    }

    public List<Airplane> getCarrier() {
        return carrier;
    }

    public int evaluateAmmoNeed() {
        int ammoNeed = 0;
        for (Airplane jet : this.carrier) {
            ammoNeed += jet.ammoNeeded();
        }
        return ammoNeed;
    }

    public void fight(Carrier carrierEnemy) throws Exception {
        int damageCaused = 0;
        System.out.println("---------------------------------------------");
        System.out.println("Carrier attacked by EnemyCarrier!");
        System.out.println("---------------------------------------------");
        for (Airplane jet : carrier) {
            jet.fight();
            damageCaused += jet.getDamageCounterThisFight();
            jet.setDamageCounterThisFight(0);
        }
        carrierEnemy.setHealthPoints(damageCaused);
        setTotalDamage(damageCaused);
        System.out.println("You caused: " + damageCaused + " Damage!");
        if (carrierEnemy.getHealthPoints() < 0) {
            throw new Exception("The Enemy Carrier is destroyed!");
            } else {
            System.out.println("The enemy Carrier has " + carrierEnemy.getHealthPoints() + " HP left after the attack.");
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints -= healthPoints;
    }

    public void getStatus() {
        System.out.println();
        System.out.println("Carrier " + this.name + " Statistics: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("HP: " + this.healthPoints + " | Aircraft count: " + carrier.size() +
                " | Ammo storage: " + this.ammoStore + " | Total damage: " + getTotalDamage() );
        System.out.println("The Jets of the Carrier: ");
        for (Airplane jet : carrier) {
            jet.getStatus();
        }
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage += totalDamage;
    }
}
