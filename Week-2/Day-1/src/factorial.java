import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a positive number, and see its factorial result: ");
        int number = scanner.nextInt();

        System.out.println(factorio(number));
    }

    public static int factorio(int input){

        int result= 1;

        if (input == 0) {
            result = 1;
        } else if (input <= 0) {
            result = 1;
        }
        else {
            for (int i = 1; i <= input; i++) {
                result = result*i;
            }
        }
        return result;
    }
}
