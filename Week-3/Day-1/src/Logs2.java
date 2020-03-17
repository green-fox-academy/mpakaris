import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs2 {
    public static void main(String[] args) throws IOException {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        Path filepath = Paths.get("./assets/log.txt");
        List<String> logFile = Files.readAllLines(filepath);
        // Control: System.out.println(logFile);

        ArrayList<String> splittedLogFile = new ArrayList<>();

        for (String line : logFile) {
            String[] splitList = line.split(";");
            System.out.println(Arrays.toString(splitList));
           //  System.out.println(splittedLogFile.add(splitList[0]));
            splittedLogFile.add(splitList[1].substring())
        }




    }



}
