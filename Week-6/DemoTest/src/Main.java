import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] splitLineOfLine;
        ArrayList<String[]> splitArrayOfEachLine = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/webShopItems.csv"));
            String line = reader.readLine();
            while (line != null) {
                splitLineOfLine = line.split(";");
                splitArrayOfEachLine.add(splitLineOfLine);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new Exception("File not found");
        } catch (IOException e) {
            throw new Exception("File could not be read");
        }

        List<Product> listProduct = new ArrayList<>();

        for (int i = 0; i < splitArrayOfEachLine.size(); i++) {

            listProduct.add(new Product (splitArrayOfEachLine.get(i)[0],
                    splitArrayOfEachLine.get(i)[1],
            splitArrayOfEachLine.get(i)[2],
            Double.valueOf(splitArrayOfEachLine.get(i)[3]),
            splitArrayOfEachLine.get(i)[4],
            Integer.valueOf(splitArrayOfEachLine.get(i)[5])));
        }

        listProduct
                .stream()
                .forEach(p -> System.out.println(p.getName() + " | " + p.getDescription()));


    }
}
