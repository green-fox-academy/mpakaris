import java.util.Scanner;

public class drawPyramide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number:");
        int rows = scanner.nextInt();
        int k = 0;

        for (int i = 1; i<=rows; i++, k=0) {

                for (int j = 1; j <= rows-i; j++) {
                    System.out.print("  ");
                }

                while (k != 2*i- 1) {
                    System.out.print("* ");
                    ++k;
                }

            System.out.println();
        }



    }
}