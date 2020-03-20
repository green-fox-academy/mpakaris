package CowsAndBulls;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CowsAndBulls newGame = new CowsAndBulls();

        // Generate String --> Random Number
        newGame.generateRandomNumber();

        // WelcomeMessage for Gamer:
        newGame.welcomeGamer();

        // ask for GameStatus:
        while (newGame.getGameStatus()) {
            //Ask for Input from User:

            newGame.readInputfromUser();

        }






    }
}
