import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Map;

public class ExercisesWorkshop {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Even numbers sorted: " + evenNumbers);

        List<Integer> squarePos = numbers.stream()
                .filter(num -> num > 0)
                .map(num -> num*num)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Square of positive numbers: " + squarePos);

        List<Integer> squareBigger20 = numbers.stream()
                .map(num -> num*num)
                .sorted()
                .filter(num -> num > 20)
                .collect(Collectors.toList());

        System.out.println("Square that is bigger than 20: " + squareBigger20);

        double avg = numbers.stream()
                .mapToInt(Integer::byteValue)
                .filter(num -> num % 2 != 0)
                .average().orElse(0);

        System.out.println("Average of Odd Numbers: " + avg);

        List<Integer> numbers2 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int sum = numbers2.stream()
                .mapToInt(Integer::byteValue)
                .filter(num -> num % 2 != 0)
                .sum();

        System.out.println("Sum of Odd numbers: " + sum);

        String word = "Mississippi";
        IntStream intStream = word.chars();
        intStream
                .filter(c -> Character.isUpperCase(c))
                .forEach(c -> System.out.println("Capital Character: " + (char)c));

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        char startChar = 'A';
        String answer = cities.stream()
                .filter(c -> c.charAt(0) == startChar)
                .collect(Collectors.joining(" and ", "The cities that start with the Character " + startChar + " are: ", ""));
        System.out.println(answer);

        List<Character> listOfChars =  Arrays.asList('N', 'i', 'k', 'o');
        listOfChars.stream()
                .forEach(System.out::print);
        System.out.println("\n---------------\n");

        Map<Character, Long> frequency = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency of Characters in the word: " + word + " --> " + frequency);

        System.out.println("\n---------------\n");
        List<Fox> allFoxes = new ArrayList<>();
        allFoxes.add(new Fox ("Alex", "green", 1));
        allFoxes.add(new Fox ("Berci", "green", 20));
        allFoxes.add(new Fox ("Conrad", "green", 30));
        allFoxes.add(new Fox ("Zupi", "blue", 10));
        allFoxes.add(new Fox ("Xander", "blue", 10));

        List<Fox> greenFoxes = allFoxes.stream()
                .filter(f -> f.getColor().equals("green"))
                .collect(Collectors.toList());

        System.out.println("The green foxes are: ");
        greenFoxes.stream()
                .forEach(f -> System.out.println(f.getName()));
        System.out.println();
        System.out.println("Grüner Fuch und jünger wie 5 Jahre: ");
        allFoxes.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));
        System.out.println("Frequency by Colour: ");

        Map<String, Long> mapFoxesColor = allFoxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
        System.out.println(mapFoxesColor);
    }
}
