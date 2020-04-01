package PiratesExercise;

import java.util.Random;

public class Pirate {

    protected boolean alive = true;
    protected boolean passedOut = false;
    protected boolean isCaptain = false;
    protected String nameOfPirate;
    protected int counterRum = 0;
    protected Random random = new Random();

    public Pirate(String name, boolean isCaptain) {
        this.nameOfPirate = name;
        this.isCaptain = isCaptain;
    }

    public void drinkSomeRum() {
        if (!this.alive) {
            System.out.println("He is dead.");
        } else {
            this.counterRum = random.nextInt(10);
        }
    }

    public void howIsItGoingMate() {
        if (!this.alive) {
            System.out.println("He is dead.");
        } else if (this.counterRum <= 4){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public void brawl(Pirate pirateEnemy){
        if (pirateEnemy.alive){
            int chances = 0;
            while (chances == 0) {
                chances = random.nextInt(9);
            }
            if (chances >= 1 && chances <= 3) {
                pirateEnemy.alive = false;
                System.out.println(pirateEnemy.nameOfPirate + " lost and died.");
            } else if (chances >= 7 && chances <= 9) {
                this.alive = false;
                System.out.println(this.nameOfPirate + " lost and died.");
            } else {
                this.passedOut = true;
                pirateEnemy.passedOut = true;
                System.out.println("No winner. Both passed out.");
            }
        } else {
            System.out.println("No fightin' the Pirate is already dead!");
        }
    }
}
