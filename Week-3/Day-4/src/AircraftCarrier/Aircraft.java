package AircraftCarrier;

public class Aircraft{
    public String aircraftTypeName = "";
    public boolean aircraftType16 = false;
    public int ammoMax16 = 8;
    public int ammoStorage16 = 0;
    public int baseDamage16 = 30;
    public int allDamage16 = 0;
    public  boolean aircraftType35 = false;
    public int ammoMax35 = 12;
    public int ammoStorage35 = 0;
    public int baseDamage35 = 50;
    public int allDamage35 = 0;
    boolean priority = false;
    public int ammoRefilled = 0;
    public int ammoCounter = 0;

    public Aircraft(int aircraftType){
        if (aircraftType == 1) {
            this.aircraftTypeName = "F16";
            this.aircraftType16 = true;
            this.ammoMax16 = 8;
            this.baseDamage16 = 30;
            this.ammoStorage16 = 0;
            System.out.println("An F16 aircraft was created.");
            System.out.println("---------------");
            this.priority = false;
        } else if (aircraftType == 2) {
            this.aircraftTypeName = "F35";
            this.aircraftType35 =true;
            this.ammoMax35 = 12;
            this.baseDamage35 = 50;
            this.ammoStorage35 = 0;
            System.out.println("An F35 aircraft was created.");
            System.out.println("---------------");
            this.priority = true;
        } else {
            System.out.println("This aircraft does not exist.");
            System.out.println("---------------");
        }
    }

    public void isPriority(){
        if(this.aircraftType16){
            System.out.println("Priority Status of F16: " + this.priority);
        }else if(this.aircraftType35){
            System.out.println("Priority Status of F35: " + this.priority);
        }
        System.out.println("---------------");
    }

    public void getType(){
        if(this.aircraftType16){
            System.out.println("Aircraft Type: " + this.aircraftTypeName);
        } else if (this.aircraftType35) {
            System.out.println("Aircraft Type: " + this.aircraftTypeName);
        }
        System.out.println("---------------");
    }

    public void getStatus(){
        if (this.aircraftType16){
            System.out.println("Type: " + this.aircraftTypeName + ", Ammo: " + this.ammoStorage16 + ", Base Damage: " + baseDamage16 + ", All Damage: " + this.allDamage16);
        }else if (this.aircraftType35){
            System.out.println("Type: " + this.aircraftTypeName + ", Ammo: " + this.ammoStorage35 + ", Base Damage: " + baseDamage35 + ", All Damage: " + this.allDamage35);
        }
        System.out.println("---------------");
    }

    public int refill(int refillAmount){

          if(this.aircraftType16){
              System.out.println("F16 gets a refill.");
              while(this.ammoStorage16 < this.ammoMax16 && refillAmount >0 ){
                  this.ammoStorage16++;
                  this.ammoCounter++;
                  refillAmount--;
                  if (this.ammoStorage16 == this.ammoMax16){
                      break;
                  }
              }
              this.ammoRefilled = refillAmount;
             // System.out.println("Storage of F16 filled with: " +this. ammoStorage16 + " ammo.");
              // System.out.println("Remaining ammo now: " + refillAmount);
              // System.out.println("---------------");
          } else if (this.aircraftType35){
                  System.out.println("F35 gets a refill.");
                  while(this.ammoStorage35 < this.ammoMax35 && refillAmount >0){
                      this.ammoStorage35++;
                      this.ammoCounter++;
                      refillAmount--;
                      if (this.ammoStorage35 == this.ammoMax35){
                          break;
                      }
                  }
                  this.ammoRefilled = refillAmount;
                  // System.out.println("Storage of F35 filled with: " + this.ammoStorage35 + " ammo.");
                  // System.out.println("Remaining ammo now: " + refillAmount);
              // System.out.println("---------------");
          }
          return this.ammoRefilled;
    }

    public void fight(){
        System.out.println("Plane entered the Fight-Mode: ");
       if (this.aircraftType16) {
           int damage = this.ammoStorage16 * this.baseDamage16;
           this.allDamage16 += damage;
           System.out.println("The F16 caused " + damage + " damage with " + this.ammoStorage16 + " ammo.");
           this.ammoStorage16 = 0;
           System.out.println("---------------");

       } else if (this.aircraftType35) {
           int damage = this.ammoStorage35 * this.baseDamage35;
           this.allDamage35 += damage;
           System.out.println("The F35 caused " + damage + " damage with " + this.ammoStorage35 + " ammo.");
           this.ammoStorage35 = 0;
           System.out.println("---------------");
       }
    }
}
