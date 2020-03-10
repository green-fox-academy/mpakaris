import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class takesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println("");
        System.out.println("The original sentence is: ");
        System.out.println(quote);
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        // Split String to Array
        String[] quoteArray = quote.split(" ");
        //System.out.println(Arrays.toString(quoteArray));

        // Convert Array to List
        List<String> quoteList = new ArrayList<>();
        for (int i = 0; i < quoteArray.length; i++) {
            quoteList.add(i, quoteArray[i]);
        }

        //System.out.println("");
        //System.out.println(quoteList);
        //System.out.println();

        // add toBeAddedString to quoteList
        quoteList.add(3, "always");
        quoteList.add(4, "takes");
        quoteList.add(5, "longer");
        quoteList.add(6, "than");
        //System.out.println(quoteList);

        //un-split the List to String
        String finalSentence = String.join(" ", quoteList);
        System.out.println();

        //Print final sentence
        System.out.println("The final corrected sentence is: ");
        System.out.println(finalSentence);
    }
}
