import java.util.*;
public class urlFinder {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        System.out.println();
        System.out.println("The given address is: ");
        System.out.println(url);
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different string functions!

        // Task 1: add ":" after https

        StringBuffer correctedString = new StringBuffer(url);
        correctedString.insert(5, ":");
        url = correctedString.toString();
        System.out.println();
        System.out.println("Added missing part after https: ");
        System.out.println(url);

        // Task 2: replace -bots with -odds
        String correctedUrl = url.replace("bots", "odds");
        System.out.println();
        System.out.println("Replaced -bots with -odds: ");
        System.out.println(correctedUrl);
    }
}
