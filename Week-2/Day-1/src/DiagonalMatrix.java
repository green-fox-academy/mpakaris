import java.lang.reflect.Array;
import java.util.Arrays;

public class DiagonalMatrix {

    public static void main(String[] args) {

        int[][] duoArray = new int[4][4];

        for (int i = 0;  i < duoArray.length; i++) {
            for (int j=0; j<duoArray[i].length; j++) {
                if (i == j) {
                    duoArray[i][j] = 1;
                }
            }
        }

        // Prints the doubleArray in one line
        System.out.println(Arrays.deepToString(duoArray));
        System.out.println();

        //Prints doubleArray in each line
        for (int i = 0; i <duoArray.length ; i++) {
            System.out.print(" | ");
            for (int j = 0; j < duoArray[i].length; j++) {
                System.out.print(duoArray[i][j] + " | ");
            }
            System.out.println("");
        }




    }

}
