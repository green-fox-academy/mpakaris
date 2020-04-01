package PiratesExercise;

public class Main {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("1", true);
        Pirate pirate2 = new Pirate("2", true);
        pirate.drinkSomeRum();
        pirate.brawl(pirate2);

        Ship ship1 = new Ship();
        ship1.fillShip();

        Ship ship2 = new Ship();
        ship2.fillShip();
        ship1.battleShip(ship2);
    }
}
