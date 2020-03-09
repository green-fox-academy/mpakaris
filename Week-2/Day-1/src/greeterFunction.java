import java.util.Arrays;

public class greeterFunction {
    public static void main(String[] args) {
        System.out.println();
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `Greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`

        String al = "Green Fox";
        System.out.println(Greet(al));
        System.out.println(Greet("Blue Elephant"));
    }

    public static String Greet(String input) {
        String greeting = "Greetings dear, ";
        String output = greeting + input;
        return output;
    }

}




