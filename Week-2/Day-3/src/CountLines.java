import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        System.out.println();
        System.out.println("This program counts the lines of a My-Text.");
        int linesResult = 0;
        linesResult = countLines();
        if (linesResult != 0)
            System.out.println("The My-Text file has " + linesResult + " lines.");
        else {
            System.out.println(linesResult);
        }
    }

    public static int countLines(){
        try {
            int counter = 0;
            Path path = Paths.get("src/my-file.txt");
            List<String> textFile = Files.readAllLines(path);
            for (String line : textFile) {
                counter++;
            }
            return counter;
        } catch (NoSuchFileException e) {
            //System.out.println("0");
            int counter = 0;
            return counter;
        } catch (IOException e) {
            int counter = 0;
            return counter;
        }
    }
}
