import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lottery {

    public static void main(String[] args) throws IOException {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

        Path filePath = Paths.get("src/lottery.csv");
        List<String> csvFile = Files.readAllLines(filePath);
        ArrayList<String> csvArray = new ArrayList<>();
        for (String line : csvFile) {
            String[] splitCsvArray = line.split(";");
            csvArray.add(splitCsvArray[11]);
            csvArray.add(splitCsvArray[12]);
            csvArray.add(splitCsvArray[13]);
            csvArray.add(splitCsvArray[14]);
            csvArray.add(splitCsvArray[15]);
        }
        System.out.println(csvArray); // All numbers of the CSV File now in one String-Array

        findLotteryNumbers(csvArray);

    }

    public static void findLotteryNumbers(ArrayList<String> numberArray) {

        //Statistical Mode Function
        int counter = 0;
        int counterMx = 0, counterMx2 = 0, counterMx3 = 0, counterMx4 = 0, counterMx5 = 0;
        String biggestNumber = "";
        String biggestNumber2 = "";
        String biggestNumber3= "";
        String biggestNumber4 = "";
        String biggestNumber5 = "";

        for (int i = 0; i < numberArray.size(); i++) {

            for (int j = 0; j < numberArray.size(); j++) {

                //String object passed into the Foor-Loops
                String iArray = numberArray.get(i);
                String jArray = numberArray.get(j);
                // Need to parse the Strings into Integer in order to compare!!! Othersie no work.
                int iArrayInt = Integer.parseInt(iArray);
                int jArrayInt = Integer.parseInt(jArray);

                if (iArrayInt == jArrayInt) {
                    counter++;
                }
            }

            if (counter > counterMx) {
                counterMx = counter;
                biggestNumber = numberArray.get(i);
            } else if (counter > counterMx2) {
                counterMx2= counter;
                biggestNumber2 = numberArray.get(i);
            } else if (counter > counterMx3) {
                counterMx3= counter;
                biggestNumber3 = numberArray.get(i);
            } else if (counter > counterMx4) {
                counterMx4= counter;
                biggestNumber4 = numberArray.get(i);
            } else if (counter > counterMx5) {
                counterMx5= counter;
                biggestNumber5 = numberArray.get(i);
            }

            counter = 0;
        }

        System.out.println("Biggest Number:");
        System.out.println(biggestNumber);
        System.out.println("maxcount " + counterMx);

        System.out.println("Biggest Number 2:");
        System.out.println(biggestNumber2);
        System.out.println("maxcount " + counterMx2);

        System.out.println("Biggest Number 3:");
        System.out.println(biggestNumber3);
        System.out.println("maxcount " + counterMx3);

        System.out.println("Biggest Number 4:");
        System.out.println(biggestNumber4);
        System.out.println("maxcount " + counterMx4);

        System.out.println("Biggest Number 5:");
        System.out.println(biggestNumber5);
        System.out.println("maxcount " + counterMx5);




    }
}
