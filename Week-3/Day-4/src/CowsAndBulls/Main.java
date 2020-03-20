package CowsAndBulls;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-----------------------------");
        CowsAndBulls newGame = new CowsAndBulls();

        newGame.welcomeGamer();
        while(newGame.anotherGame) {
            newGame.setGuesses();
            System.out.println();
            newGame.generateRandomNumber();
            while (newGame.getGameStatus()) {
                newGame.readInputfromUser();
            }
            newGame.askForAnotherGame();
        }
        newGame.
    }
}
