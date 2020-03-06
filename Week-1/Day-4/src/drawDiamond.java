import java.util.Scanner;

public class drawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Number of rows: ");

        int number = scanner.nextInt();

        for (int i=1; i<=number; i++) {

            int k=0;

            for (int j=1; j<=number-i; j++) {
                System.out.print(" ");
            }

            while (k != 2*number-1) {
                System.out.print("* ");
                k++;
            }


            System.out.println();
        }






    }
}
