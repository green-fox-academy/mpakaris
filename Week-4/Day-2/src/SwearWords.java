import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) throws IOException {

        System.out.println();
        int Names = filterSwearWordsFromFile();


    }

    public static int filterSwearWordsFromFile() throws IOException {
        int amountSwearWords = 0;

        Path pathFile = Paths.get("src/content.txt");
        List<String> textFile = Files.readAllLines(pathFile);
        for (String line : textFile) {
            System.out.println(line);
        }



        return amountSwearWords;
    }
}
