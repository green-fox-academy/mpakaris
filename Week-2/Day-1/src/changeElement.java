import java.util.Arrays;

public class changeElement {
    public static void main(String[] args) {

        int[] s = {1, 2, 3, 8, 5, 6};

        System.out.println(Arrays.toString(s));

        int sub = 8; // What to search for in the Array
        int n = 4; // What to exchange for

        for (int i = 0; i < s.length; i++) {
            if (s[i] == sub) {
                s[i] = n;
                System.out.println(Arrays.toString(s));
            }
        }

        System.out.println("The 4th Element: " + s[3]);
    }
}