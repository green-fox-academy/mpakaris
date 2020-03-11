import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("This programm divides a number by 10.");
        System.out.println("");
        exchaptionHandling();
    }

    public static void exchaptionHandling(){

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type a number: ");
            int numberUser = scanner.nextInt();
            int dividor = 10;
                if (numberUser == 0)
                    System.out.println("Fail");
                else
                    divide(numberUser, dividor);
        } catch(InputMismatchException e) {
            System.out.println("Please type an Integer number!");
        } catch(ArithmeticException e) {
            System.out.println("Fail");
        } catch(Exception e) {
            System.out.println("Something went generally wront!");
        }
    }

    public static void divide(int number1, int number2){
        int result = number1/number2;
        System.out.println("The result is: " + result);
    }

}
