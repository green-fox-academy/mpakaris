import java.util.Arrays;

public class incrementElement {
    public static void main(String[] args) {

        int[] t = {1, 2, 3, 4, 5};
        int n = 3; // Which Element should be incremented?
        int j = t[2]; // save t[2] before it is altered in the if-loop

        for (int i = 0; i < t.length; i++) {

            if (i == 2) {
                t[2]++;
            }

        }

        System.out.println("The incremented Element: ");
        System.out.println("Before: " + j);
        System.out.println("Afterwards: " +t[2]);

    }
}
