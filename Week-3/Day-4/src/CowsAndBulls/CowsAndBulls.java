package CowsAndBulls;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CowsAndBulls<Stringbuilder> {

    public int counter = 1;
    public boolean alive = true;
    public Scanner scanner = new Scanner(System.in);

    //public Stringbuilder guessedNumberUser = "";
    public ArrayList<String> recordOfGame = new ArrayList<>();
    public StringBuilder guessedNumber = new StringBuilder();
    public StringBuilder numberToGuessStringified = new StringBuilder();

    public CowsAndBulls(){
    }

    public boolean getGameStatus(){
        return this.alive;
    }

    public void welcomeGamer(){
        System.out.println("Welcome to <Cows&Bulls> by MPAK-entertainment!");
        System.out.println("The goal is, to guess a randomly generated 4-Digit Number");
        System.out.println("You have 10 guesses! Good luck...");
        System.out.println();
    }

    public void generateRandomNumber(){
        //Generate random number between 1000 & 9999
        int numberToGuess = (int) (Math.random() * 9999);
        numberToGuessStringified = new StringBuilder(Integer.toString(numberToGuess));
        while(numberToGuessStringified.length() < 4) {
            numberToGuess = (int) (Math.random() * 9999);
            numberToGuessStringified = new StringBuilder(Integer.toString(numberToGuess));
        }
        System.out.println("A random number was generated!");
        System.out.println();
        // Record generated Number in Array "recordOfGame":
        String randomNumberString = Integer.toString(numberToGuess);
    }

    public void recordRandomNumber(String randomGeneratedNumber){
        System.out.println("Randomly generated Number: " + randomGeneratedNumber);
    }

    public void readInputfromUser(){
        System.out.println("Please give a number: ");
        this.guessedNumber = new StringBuilder(scanner.nextLine());

        while (this.guessedNumber.length() > 4 || this.guessedNumber.length() < 4) {
            System.out.println("The number must have exactly 4 Digits! Please guess again: ");
            this.guessedNumber = new StringBuilder(scanner.nextLine());
        }
        // Write guessedNumber into Array-Game record:
        recordGuessedNumbers(this.guessedNumber);
        // Send guessed Number for Evaluation:
        evaluationOfGuessedNumber();
    }

    public void recordGuessedNumbers(StringBuilder userGuessedNumber){
        String lineSeparator = "----------------------------";
        this.recordOfGame.add(lineSeparator);

        // Save guess in ArrayList:
        String saveInArrayList = "Guess " + (this.counter) + ": " + userGuessedNumber;
        this.recordOfGame.add(saveInArrayList);

    }

    public void increaseCounter(){
        this.counter++;
        if (this.counter > 5) {
            this.alive = false;
            recordRandomNumber(this.numberToGuessStringified.toString());
            System.out.println("You lost!");
        }
    }

    public void evaluationOfGuessedNumber(){
        int counterCows = 0;
        int counterBulls = 0;
        StringBuilder tempNumberToGuess = new StringBuilder(this.numberToGuessStringified);
        StringBuilder tempGuessedNumber = new StringBuilder(this.guessedNumber);
        for (int i = 0; i < 4; i++) {
            int str1_ch = (int)tempNumberToGuess.charAt(i);
            int str2_ch = (int)tempGuessedNumber.charAt(i);
            if (str1_ch == str2_ch) {
                tempNumberToGuess.setCharAt(i, ' ');
                tempGuessedNumber.setCharAt(i, 'X');
                counterCows++;
            }
        }
        // Step 2: Look for Bulls an replace character, otherwise we count double!
        for (int i = 0; i <4 ; i++) {
            int str2_ch = (int)tempNumberToGuess.charAt(i);
            for (int j = 0; j < 4; j++) {
                if (str2_ch == (int)tempGuessedNumber.charAt(j)){
                    tempNumberToGuess.setCharAt(j, ' ');
                    counterBulls++;
                    break;
                }
            }
        }

        String evaluationOfGuessedNumber = "Cows: " + counterCows + " | Bulls: " + counterBulls;
        this.recordOfGame.add(evaluationOfGuessedNumber);
        for (String line : this.recordOfGame) {
            System.out.println(line);
        }
        System.out.println("----------------------------");

        if (counterCows == 4) {
            declareWinner();
        }

        // increase Counter after guess:
        increaseCounter();

    }

    public void declareWinner(){
        this.alive = false;
        recordRandomNumber(this.numberToGuessStringified.toString());
        System.out.println("Congratulations! You found the right Number.");
    }


}
