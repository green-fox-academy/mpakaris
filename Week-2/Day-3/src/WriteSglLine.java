import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSglLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        writeLine();
        System.out.println("You wrote successfully! ");
    }

    public static void writeLine() {

        List<String> content = new ArrayList();
        content.add("First fourth written line of my file");

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("src/my-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }

        public static void readLines(){

            try { // Required by Files.readAllLines(filePath);
                // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
                Path filePath = Paths.get("src/my-text.txt");
                List<String> lines = Files.readAllLines(filePath);
                System.out.println(lines.get(0)); // Prints the first line of the file
            } catch (Exception e) {
                System.out.println("Uh-oh, could not read the file!");
            }

        }
}
