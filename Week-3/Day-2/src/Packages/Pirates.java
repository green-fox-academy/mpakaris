package Packages;

public class Pirates {

    public int counterOfRum = 0;
    public String nameOfPirate;
    public boolean alivePirate = true; // when FALSE then Pirate dead

    public Pirates(String nameOfPirateMain){

        this.nameOfPirate = nameOfPirateMain;

    }

    public void drinkSomeRum(){

        if (alivePirate) {
            counterOfRum++;
            System.out.println(nameOfPirate + " had already " + counterOfRum + " bottles of Rum.");
            System.out.println();
        } else {
            System.out.println("Sorry, " + nameOfPirate + " is dead and doesnt drink.");
            System.out.println();
        }
    }

    public void howsItGoingMate(){

        if (counterOfRum >= 0 && counterOfRum <= 4) {
            System.out.println("Pour me anudder!");
            System.out.println();
            counterOfRum++;
            System.out.println(nameOfPirate + " had already " + counterOfRum + " bottles of Rum.");
            System.out.println();
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            System.out.println();
            // passes out
            // sleeps it off
        }
    }

    public void die(){
        this.alivePirate = false;
        System.out.println();
        System.out.println(nameOfPirate + " died like a dog in the streets.");
        System.out.println();
    }

    public void brawl(Pirates pirateToFightAgainst){
        System.out.println();
        // Create a 1/3 probability --> Create numbers 1 to 9 --> 1-3 Pirate 1 winds, 4-6 Pirate 2, 7-9 both pass out
        double resultFight = 0;

        if (pirateToFightAgainst.alivePirate && alivePirate) {
            while (resultFight == 0) {
                resultFight = Math.floor(Math.random() * 10);
                System.out.println(resultFight);
            }
            System.out.println("Fight Fight Fight!");
            if (resultFight >= 1 && resultFight <= 3){
                System.out.println(nameOfPirate + " won the fight");
                //Kill the losing Pirate
                pirateToFightAgainst.die();
            } else if (resultFight >=4 && resultFight <= 6) {
                System.out.println(pirateToFightAgainst.nameOfPirate + " won the fight");
                //Kill the losing Pirate
                this.die();
            } else {
                System.out.println("Both passed out!");
            }
        }








    }

}
