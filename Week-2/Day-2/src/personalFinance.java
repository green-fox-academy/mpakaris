import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class personalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> myFinances = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //Create an application which solves the following problems.
        //How much did we spend?
        //Which was our greatest expense?
        //Which was our cheapest spending?
        // What was the average amount of our spendings?

        // Display Expenses
        System.out.println();
        System.out.println("Our expanses were: ");
        for (Integer amount : myFinances) {
            System.out.print(amount + ", ");
        }
        System.out.println();

        // Add all values
        int sum = 0;
        for (Integer amount : myFinances) {
            sum = sum + amount;
        }
        System.out.println();
        System.out.println("We spend altogether this amount: " + sum);
        System.out.println();

        // Greatest Expense
        int greatestExpense = myFinances.get(0);
        for (Integer amount : myFinances) {
            if (amount > greatestExpense) {
                greatestExpense = amount;
            }
        }
        System.out.println("Greatest expense was: " + greatestExpense);

        // Smallest Expense
        int smallestExpense = myFinances.get(0);
        for (Integer amount : myFinances) {
            if (amount < smallestExpense) {
                smallestExpense = amount;
            }
        }
        System.out.println();
        System.out.println("Cheapest expense was: " + smallestExpense);

        // Average amount of spending
        int counter = 0;
        for (Integer amount : myFinances) {
         counter++;
        }
        int average = sum/counter;
        System.out.println();
        System.out.println("Average amount of spendings was: " + average);
        ;
    }
}


