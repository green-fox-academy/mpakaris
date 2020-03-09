import java.util.Scanner;
import java.util.Arrays;

public class armstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("This program checks for Armstrong numbers.");
        System.out.println("Please type in a number: ");

        int number = scanner.nextInt();     //It is the number to check for armstrong

        int c = 0;
        int a, temp;

        temp = number;

        while(number>0)
        {
            a = number % 10;
            System.out.println(a);
            number = number / 10;
            System.out.println(number);
            c = c + (a*a*a);
            System.out.println(c);
        }

            if( temp == c )
                System.out.println("armstrong number");
            else
                System.out.println("Not armstrong number");











    }


}
