import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) throws IOException {
        // Create a method that decrypts encoded-lines.txt

        decriptsLines("encoded-lines.txt");
    }

    public static <ListArray> void decriptsLines(String fileName) throws IOException {

        Path filepath = Paths.get("src/" + fileName);
        List<String> allLines = Files.readAllLines(filepath);
        Control: System.out.println(allLines);
        List<String> newLines = allLines;
        System.out.println(allLines);

        for (int i = 0; i < allLines.size() ; i++) { // goes line by line
           String constructedNewLine = "";

            for (int j = 0; j < allLines.get(i).length(); j++) { // goes Character by Character
                constructedNewLine += String.valueOf(allLines.get(i).charAt(j)-1);
            }
            newLines.set(i, constructedNewLine);
        }

        System.out.println(newLines);

    }
}
