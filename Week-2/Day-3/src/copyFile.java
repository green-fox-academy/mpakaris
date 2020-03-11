import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class copyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        System.out.println();
        System.out.println("This program is copying the content of one file into another.");

        // Dive into copyPaste-Method
        boolean resultPositive = copyPaste();

        // return from copyPaste-Method:
        if (resultPositive)
            System.out.println("Yey, successfully copied the file!");
        else
            System.out.println("nope nope nope nope. Maybe should try again!");
    }

    public static boolean copyPaste(){
        try {
            System.out.println();
            System.out.println("What is the filename of the file to be copied?");
            Scanner scanner = new Scanner(System.in);
            String originalFileName = scanner.nextLine();
            System.out.println();
            System.out.println("What is the filename of the clone file?");
            String cloneFileName = scanner.nextLine();

            String pathOriginalFile = "src/" + originalFileName;
            String pathCloneFIle = "src/" + cloneFileName;

            Path path = Paths.get(pathOriginalFile);
            Path path2 = Paths.get(pathCloneFIle);
            List<String> originalFile = Files.readAllLines(path);
            List<String> cloneFile = new ArrayList<>(originalFile);

           Files.write(path2, cloneFile);

           boolean cloningSuccess = true;
           return cloningSuccess;

        } catch (IOException e) {
            boolean cloningSucess = false;
            return cloningSucess;
        }
    }
}
