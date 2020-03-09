import java.util.Arrays;

public class appendAFunc {
    public static void main(String[] args) {
        System.out.println();
        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        // - Write a function called `AppendAFunc` that gets a string as an input,
        //   appends an 'a' character to its end and returns with a string
        // - Print the result of `AppendAFunc(typo)`
        String typo = "Chinchill";
        System.out.println(AppendAFunc(typo));
    }

    public static String AppendAFunc(String input) {

        String output = input + "a";
        return output;
    }

}
