package Airplanes;

public class Airplane {

    private String type;
    private int maxAmmo, ammoCounter, baseDamage, damageCounter, damageCounterThisFight = 0;
    private boolean isPriority;


    public Airplane(String type, int maxAmmo, int baseDamage, boolean isPriority) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.ammoCounter = 0;
        this.baseDamage = baseDamage;
        this.damageCounter = 0;
        this.isPriority = isPriority;
    }

    public void fight() {
        this.damageCounterThisFight = this.ammoCounter*this.baseDamage;
        this.damageCounter += this.damageCounterThisFight;
        this.ammoCounter = 0;
    }

    public int refill(int ammo) {
        while (this.ammoCounter < this.maxAmmo) {
            this.ammoCounter++;
            ammo--;
            if (ammo == 0) {
                break;
            }
        }
        return ammo;
    }

    public String getType() {
        return type;
    }

    public void getStatus() {
        System.out.println("Type: " + getType() + " | Ammo: " + this.ammoCounter + " | Base Damage: " + this.baseDamage + " | All Damage: " + this.damageCounter  );
    }

    public boolean isPriority() {
        return isPriority;
    }

    public int ammoNeeded() {
        return this.maxAmmo-this.ammoCounter;
    }

    public int getAmmoCounter() {
        return this.ammoCounter;
    }

    public void setAmmoCounter(int ammoCounter) {
        this.ammoCounter = ammoCounter;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public int getDamageCounterThisFight() {
        return damageCounterThisFight;
    }

    public void setDamageCounterThisFight(int damageCounterThisFight) {
        this.damageCounterThisFight = damageCounterThisFight;
    }
}
