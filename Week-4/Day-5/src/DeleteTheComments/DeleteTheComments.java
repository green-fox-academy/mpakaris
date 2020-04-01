package DeleteTheComments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeleteTheComments {
    // Create a function that takes a java source file path (e.g. "src.java") as an input,
    // reads the given file, and remove the singe line comments from it. It should write the comment-free
    // code to the original file.

    public static void main(String[] args) throws IOException {
        removeSingleLineComments("src/DeleteTheComments/TestFile.java");
    }

    public static void removeSingleLineComments(String filePath) throws IOException {
        List<String> fileContent = new ArrayList<>();
        List<String> fileContentCleaned = new ArrayList<>();
        Path path = null; 
        try {
            path = Paths.get(filePath);
            fileContent = Files.readAllLines(path);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        for (int i = 0; i < fileContent.size(); i++) {
            if (!fileContent.get(i).contains("//")) {
               fileContentCleaned.add(fileContent.get(i));
            } else {
                fileContentCleaned.add("");
            }
        }
        Files.write(path, fileContentCleaned);
    }
}