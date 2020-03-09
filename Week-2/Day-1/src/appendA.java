import java.util.Arrays;

public class appendA {
    public static void main(String[] args) {

        System.out.println();
        String[] animals = {"koal", "pand", "zebr"};
        System.out.println(Arrays.toString(animals));

        for (int i = 0; i < animals.length; i++) {
             animals[i] = animals[i]+"a";
        }

        System.out.println(Arrays.toString(animals));

    }
}
