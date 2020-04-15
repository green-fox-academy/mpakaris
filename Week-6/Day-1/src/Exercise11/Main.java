package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Assets/wiki3.txt");
        List<String> lines = Files.readAllLines(path);
        String oneLine = lines.get(0);
        // System.out.println(oneLine);
        String[] splitText = oneLine.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].charAt(splitText[i].length()-1) == '.' || splitText[i].charAt(splitText[i].length()-1) == ',' ||
                    splitText[i].charAt(splitText[i].length()-1) == ')' ) {
                splitText[i] = splitText[i].substring(0, splitText[i].length()-1);
            }
            if (splitText[i].charAt(0) == '('){
                splitText[i] = splitText[i].substring(1);
            }
        }

        String oneLineCleansed = "";

        for (int i = 0; i < splitText.length; i++) {
            oneLineCleansed +=  splitText[i] + " ";
        }

        // Convert StringArray[] into a List!
        List<String> listOfWords = Stream.of(oneLineCleansed).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = listOfWords.stream()
                .collect(toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        Map<String, Integer> sorted = wordCounter
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(100)
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted);

    }
}
