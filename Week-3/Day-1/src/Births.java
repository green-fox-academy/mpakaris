import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Births {
    public static void main(String[] args) throws IOException {
        // Create a function that
        // - takes the name of a CSV file as a parameter,
        // - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
        // - returns the year when the most births happened.
        //   - if there were multiple years with the same number of births then return any one of them

        // You can find such a CSV file in this directory named births.csv
        // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

        findsBirthDays("birthFile");

    }

    public static void findsBirthDays(String fileNameCSV) throws IOException {
        String YearOfMostBirths = "";
        Path filePath = Paths.get("src/" + fileNameCSV + ".txt");
        List<String> birthList = Files.readAllLines(filePath);
        // Control: System.out.println(Arrays.toString(new List[]{birthList}));
        ArrayList<String> birthYears = new ArrayList<>();

        for (String line : birthList) {
            String[] splitList = line.split(";");
            // Control: System.out.println(Arrays.toString(splitList));
            // Control: System.out.println(splitList[1]);;
            birthYears.add(splitList[1].substring(0, 4)); //Get all the Years out of the List with SubString
        }
        // Control: System.out.println(birthYears);
        // Loop to filter out the Years
        int counter = 0, counterMax = 0;
        String mostCommonYear = "";

        for (int i = 0; i < birthYears.size(); i++) {
            for (int j = 0; j < birthYears.size(); j++) {
                if (birthYears.get(i).equals(birthYears.get(j))) {
                    counter++;
                }
            }
            if (counter >= counterMax) {
                counterMax = counter;
                mostCommonYear = birthYears.get(i);
            }
            counter = 0;
        }
        System.out.println();
        System.out.println("The answer you are looking for is: " + mostCommonYear);
    }
}
