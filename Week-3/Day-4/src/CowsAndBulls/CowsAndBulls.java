package CowsAndBulls;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CowsAndBulls<Stringbuilder> {
    private int counter = 1;
    private int maxCredit;
    private boolean alive = true;
    public boolean anotherGame = true;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> recordOfGame = new ArrayList<>();
    private StringBuilder guessedNumber = new StringBuilder();
    private StringBuilder numberToGuessStringified = new StringBuilder();

    public CowsAndBulls(){}

    public boolean getGameStatus(){
        return this.alive;
    }

    public void welcomeGamer(){
        System.out.println("Welcome to <Cows&Bulls> by MPAK-entertainment!");
        System.out.println("The goal is, to guess a randomly generated 4-Digit Number");
    }

    public void setGuesses(){
        System.out.println("How many times do you want to try to guess?");
        this.maxCredit = scanner.nextInt();
        System.out.println(this.maxCredit + " times you shall guess!");
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
    }

    private void recordRandomNumber(String randomGeneratedNumber){
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

    private void recordGuessedNumbers(StringBuilder userGuessedNumber){
        String lineSeparator = "----------------------------";
        this.recordOfGame.add(lineSeparator);
        // Save guess in ArrayList:
        String saveInArrayList = "Guess " + (this.counter) + ": " + userGuessedNumber;
        this.recordOfGame.add(saveInArrayList);
    }

    private void increaseCounter(){
        this.counter++;
        // Loosing condition:
        if (this.counter > this.maxCredit) {
            this.alive = false;
            recordRandomNumber(this.numberToGuessStringified.toString());
            System.out.println("You lost!");
        }
    }

    private void evaluationOfGuessedNumber(){
        int counterCows = 0;
        int counterBulls = 0;
        // Use tempVariable, otherwise we overwrite each round the original Number
        StringBuilder tempNumberToGuess = new StringBuilder(this.numberToGuessStringified);
        StringBuilder tempGuessedNumber = new StringBuilder(this.guessedNumber);
        // Step 1: Look for Cows and replace charater, otherwise we count double
        for (int i = 0; i < 4; i++) {
            int str1_ch = (int)tempNumberToGuess.charAt(i);
            int str2_ch = (int)tempGuessedNumber.charAt(i);
            if (str1_ch == str2_ch) {
                tempNumberToGuess.setCharAt(i, ' ');
                tempGuessedNumber.setCharAt(i, 'X');
                counterCows++;
            }
        }
        // Step 2: Look for Bulls and replace character, otherwise we count double!
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
        // Print the efforts of the User:
        String evaluationOfGuessedNumber = "Cows: " + counterCows + " | Bulls: " + counterBulls;
        this.recordOfGame.add(evaluationOfGuessedNumber);
        for (String line : this.recordOfGame) {
            System.out.println(line);
        }
        System.out.println("----------------------------");
        // Winning Strike:
        if (counterCows == 4) {
            declareWinner();
        }
        // increase Counter after guess:
        increaseCounter();
    }

    private void declareWinner(){
        this.alive = false;
        recordRandomNumber(this.numberToGuessStringified.toString());
        System.out.println("Congratulations! You found the right Number.");
    }

    public void askForAnotherGame(){
        System.out.println();
        System.out.println("Do you want to play again? 'Y' for Yes and 'N' for No");
        String anotherGame = scanner.nextLine();
        if (anotherGame.equals("N")){
             this.anotherGame = false;
            System.out.println("See you soon!");
            System.out.println();
        } else{
            this.alive = true;
        }
    }
}
