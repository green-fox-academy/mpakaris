import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class doubledDecription {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("This program decripts the file src/duplicates.txt");
        System.out.println();
        System.out.println("This is the undecrypted Text of the file: ");
        duplicatesDecryption();
    }

    public static void duplicatesDecryption(){

        try{
            Path path = Paths.get("src/duplicates.txt");
            List<String> duplicatesFile = Files.readAllLines(path);
            List<String> clearedFile = new ArrayList<>();

            for (String line : duplicatesFile) {
                String newLine = "";
                for (int i = 0; i < line.length()-1; i+=2) {
                    newLine+=line.charAt(i);
                    if (line.charAt(i) != line.charAt(i+1))
                        newLine+=line.charAt(i+1);
                }
                clearedFile.add(newLine);
            }
            System.out.println(clearedFile);
            Files.write(path, clearedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // End of Class
}
