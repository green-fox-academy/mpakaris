import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

        System.out.println("");
        System.out.println("This program can write into files.");

        boolean result = writeFile();
        if (result)
            System.out.println("Yey, we wrote your parameters into the file!");
        else
            System.out.println("Not suppossed to be here ;) ");
    }

    public static boolean writeFile(){
        try {
            //Get Parameters: String / String / Integer
            Scanner scanner = new Scanner(System.in);
            System.out.println("We need some Parameters from you.");
            System.out.println("Please enter the Path for your file: ");
            String filePath = scanner.nextLine();
            System.out.println("Please enter a Word or Sentence: ");
            String fileWord = scanner.nextLine();
            System.out.println("Please enter a number of lines: ");
            int rows = scanner.nextInt();
            System.out.println();

            //Start Writing Process:
            Path path = Paths.get(filePath);
            List<String> linesOfFile = new ArrayList<>();
            for (int i = 0; i < rows ; i++) {
                linesOfFile.add(fileWord);
            }
            //Save file:
            Files.write(path, linesOfFile);

            //Return successfull Writing:
            boolean result = true;
            return result;

        } catch (IOException e) {
            boolean result = false;
            return result;
        }
    }

}
