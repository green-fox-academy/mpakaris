import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please write the first word: ");
        //String givenWord1 = scanner.toString();
        String givenWord1 = "dog";

        //System.out.println("Please write the first word: ");
        //String givenWord2 = scanner.toString();
        String givenWord2 = "god";

        boolean anagram = anagram(givenWord1, givenWord2);

        if (anagram) {
            System.out.println("Those words are an Anagram!");
        } else {
            System.out.println("Those words are No Anagram!");
        }
    }

    public static boolean anagram(String wordFromMain1, String wordFromMain2){

        boolean result = false;

        char arrayWord1[] = wordFromMain1.toCharArray();
        char arrayWord2[] = wordFromMain2.toCharArray();

        Arrays.sort(arrayWord1);
        System.out.println(Arrays.toString(arrayWord1));
        Arrays.sort(arrayWord2);
        System.out.println(Arrays.toString(arrayWord2));

        if (Arrays.equals(arrayWord1, arrayWord2)) {
            result = true;
        }

        return result;
    }

}
