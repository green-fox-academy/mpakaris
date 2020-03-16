import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logs {
    public static void main(String[] args) throws IOException {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        Path path = Paths.get("src/log.txt");
        List<String> logFileList = Files.readAllLines(path);

        String[] logFileArray = logFileList.toArray(new String[0]);
        List<String> AddressesIP = new ArrayList<>();
        for (String line : logFileArray) {

            String[] lineComponents = line.split(" ");
            //System.out.println(Arrays.toString(lineComponents));
            if (!AddressesIP.contains(lineComponents[8])) {
                AddressesIP.add(lineComponents[8]);
            }
        }
        System.out.println("The IP Addresses: ");
        System.out.println(AddressesIP);

        System.out.println();
        String getPostRatio = returnGetPostRatio();
        System.out.println(getPostRatio);
    }

    public static String returnGetPostRatio() throws IOException {
        Path path = Paths.get("src/log.txt");
        List<String> logLines = Files.readAllLines(path);
        int getCounter = 0, postCounter = 0;
        for (String line : logLines) {
            if (line.contains("GET")){
                getCounter++;
            } else if (line.contains("POST")){
                postCounter++;
            }
        }
        System.out.println("");
        return ("This log-file contains " + getCounter + " GET logs and " + postCounter + " POST logs.");
    }

}
