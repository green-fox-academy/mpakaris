package AircraftCarrier;

public class Aircraft {

    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int actualAmmo;
    private int overallDamage;

    public Aircraft(String type){
        this.type = type;
        this.actualAmmo = 0;
        this.overallDamage = 0;
        setBaseDamage(this.type);
        setMaxAmmo(this.type);
        System.out.println(this.type + " Was created");
    }

    public String getType(){
        return ("This is an Aircraft of type: " + this.type);
    }

    public void getStatus(){
        System.out.println("Type " + this.type +
                ", Ammo: " + this.actualAmmo +
                ", Base Damage: " + this.baseDamage +
                ", All Damage : " +this.overallDamage);
    }

    public void setOverallDamage(int damageCaused){
        this.overallDamage += damageCaused;
    }

    public void setBaseDamage(String type){
        if (type.equals("F16")){
            this.baseDamage = 30;
        } else if (type.equals("F35")){
            this.baseDamage = 50;
        }
    }

    public void setMaxAmmo(String type){
        if (type.equals("F16")){
            this.maxAmmo = 8;
        } else if (type.equals("F35")){
            this.maxAmmo = 12;
        }
    }

    public void setActualAmmo(int ammo){
        this.actualAmmo = ammo;
    }

    public int fight(){
        int damageDone = 0;
        damageDone = this.actualAmmo*this.baseDamage;
        setActualAmmo(0);
        setOverallDamage(damageDone);
        return damageDone;
    }

    public int refill(int refillAmmo){
       int temp = refillAmmo;
        int counterAmmo = 0;
        while(this.actualAmmo < this.maxAmmo && refillAmmo > 0){
            this.actualAmmo++;
            refillAmmo--;
            counterAmmo++;
        }
        refillAmmo -= counterAmmo;
        System.out.println("Initial Ammo: " + temp + "Ammo left after Refill: " + refillAmmo);
        return refillAmmo;
    }
}
