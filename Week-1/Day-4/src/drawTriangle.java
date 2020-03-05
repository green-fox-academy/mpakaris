import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number:");
        int rows = scanner.nextInt();

        for (int i = 1; i<=rows; i++) {

            for (int j=1; j <= i; j++){
                System.out.print("* "); // print --> prints next to each other
            }

          System.out.println(); // println --> jumps on line down

        }



    }
}
