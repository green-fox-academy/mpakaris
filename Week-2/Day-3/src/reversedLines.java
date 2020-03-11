import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class reversedLines {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("This Program reverses Lines!");
        System.out.println();
        reversedLines();
    }

    public static void reversedLines() {
        try {
            Path path = Paths.get("src/reversedLines.txt");
            List<String> originalFile = Files.readAllLines(path);

            for (String line : originalFile) {
                String reverse = "";
                for (int i = line.length() - 1; i >= 0; i--) {
                    reverse = reverse + line.charAt(i);
                }
                System.out.println(reverse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
