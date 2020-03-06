import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Number:");

        int rows = scanner.nextInt();

        for (int i=1; i<=rows; i++) { //external Loop goes down the lines!
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();  //switches line towards down
        }
    }
}
