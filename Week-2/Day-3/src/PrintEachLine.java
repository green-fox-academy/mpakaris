import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {

    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        System.out.println("");
        System.out.println("This program prints all lines of a Text-File.");
        System.out.println("Would you like to continue? Press Y. If No, please press any other key");
        checkResponse();
    }

    public static void checkResponse() {
        try {
            Scanner scanner = new Scanner(System.in);
            String answerUser = scanner.nextLine().toLowerCase();
            if (answerUser.equals("y")) {
                readFile();
            } else {
                System.out.println("Thank you. Maybe next time.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter only Letters!");
        } catch (Exception e) {
            System.out.println("Something generally went wrong!");
        }
    }

    public static void readFile() throws IOException {
        System.out.println();
        //define path
        Path path = Paths.get("src/my-file.txt");
        //Create List and clone file
        List<String> linesOfFile = Files.readAllLines(path);
        //Loop through clone-file
        System.out.println("--- Start of File ---");
        for (String line : linesOfFile) {
            System.out.println("- " + line);
        }
        System.out.println("--- End of File ---");
    }











}
