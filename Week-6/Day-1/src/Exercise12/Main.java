package Exercise12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Main {

    public static void main(String[] args) throws IOException {

        // List<String> fileContent = new ArrayList<>();
        String[] splitLineOfLine;

        // Final List:
        List<String[]> splitA = new ArrayList<String[]>();

        BufferedReader reader = new BufferedReader(new FileReader("Assets/swc.csv"));
        String line = reader.readLine();
        while (line != null) {
            splitLineOfLine = line.split(";");
            splitA.add(splitLineOfLine);
            line = reader.readLine();
        }

       /* for (String[] item : splitArrayOfEachLine) {
            System.out.println(Arrays.toString(item));
        } */

        // name of the heaviest Character:
        // Print the name of the heaviest character (if the mass is unknown, ignore that character):
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i < splitA.size(); i++) {
            if (!splitA.get(i)[2].equals("unknown")) {
                personList.add(new Person(splitA.get(i)[0], Integer.parseInt(splitA.get(i)[1]), Double.parseDouble(splitA.get(i)[2]), splitA.get(i)[7]));
            }
        }

        System.out.println("The heaviest in the Galaxy is: " + personList.stream()
                .max((p1, p2) -> p1.getMass() > p2.getMass() ? 1 : -1)
                .map(person -> person.getName()).orElse(""));

        // Print the average height of the male characters
        List<Person> personList2 = new ArrayList<>();
        for (int i = 1; i < splitA.size(); i++) {
            if (!splitA.get(i)[1].equals("unknown")) {
                personList2.add(new Person(splitA.get(i)[0], Integer.parseInt(splitA.get(i)[1]), splitA.get(i)[7]));
            }
        }

        System.out.println("Average height of all Male: " + personList2.stream()
                .filter(person -> person.getGender().equals("male"))
                .mapToInt(person -> person.getHeight())
                .average().orElse(0) + " cm.");


        // Print the average height of the Female characters
        System.out.println("Average height of all Female: " + personList2.stream()
                .filter(person -> person.getGender().equals("female"))
                .mapToInt(person -> person.getHeight())
                .average().orElse(0) + " cm.");








    }

    public static double convertTodouble(String number) {
        return Double.parseDouble(number);
    }


}
