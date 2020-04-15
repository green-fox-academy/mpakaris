import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        System.out.println();
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // select elements larger than r

        /*for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > 3)
                System.out.println(myList.get(i));
        }*/

        // myList.stream().filter(x -> x > 3).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        // System.out.println("Even numbers:");
        //numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        // System.out.println("Squared:");
        // numbers2.stream().mapToInt(p -> (int) Math.pow(p, 2)).forEach(System.out::println);
        System.out.println("Squares:");
        numbers2.stream().map(num -> num*num).forEach(System.out::println);
        System.out.println("Squares End");

        //System.out.println("Is square bigger 20:");
        //numbers.stream().mapToInt(p -> (int) Math.pow(p, 2)).filter(p -> p > 20).forEach(System.out::println);

        // System.out.println("Average Value of odd numbers:");
        List<Integer> numbers1 = Arrays.asList(3, 5, 8, 10, 5);
        OptionalDouble avg = numbers1.stream()
                .mapToInt(Integer::intValue)
                .filter(x -> x % 2 != 0)
                .average();
        // System.out.println(avg);

        // List<Integer> numbers2 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        /* System.out.println("Sum: " + numbers2.stream()
                .mapToInt(Integer::intValue)
                .filter(p -> p % 2 != 0)
                .sum()); */

        // Find Uppercase Character in a String.
        String word = "Mississippi";
        IntStream intStream = word.chars();
        // System.out.println("CAR: ");
        // intStream.filter(c -> Character.isUpperCase(c)).forEach(i -> System.out.println((char)i) );

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        Character c = 'A';
        // cities.stream().filter(city -> city.charAt(0) == c).forEach(System.out::println);

        List<Character> foo = Arrays.asList('N', 'i', 'k', 'o');
        // System.out.println("Concatenate: ");
        // foo.stream().forEach(System.out::print);

        //System.out.println("Frequency of Characters in a String: ");
        Character m = 'u';
        // System.out.println("'" + m + "' appears " + intStream.filter(p -> p == m).count() + " times in " + word);

        Fox fox1 = new Fox("Green1", "green", 10);
        Fox fox2 = new Fox("Green2", "green", 4);
        Fox fox3 = new Fox("blue1", "blue", 12);

        List<Fox> foxList = new ArrayList<>();
        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);

        System.out.println("Find green Foxes: ");
        foxList.stream().filter(fox -> fox.getColor().equals("green")).forEach(fox -> System.out.println(fox.getName()));
        System.out.println("Find green Foxes and Age less than 5: ");
        foxList.stream().filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5).forEach(fox -> System.out.println(fox.getName()));
        System.out.println("Find frequency of Foxes by color: --> blue");
        System.out.println(foxList.stream().filter(fox -> fox.getColor()
                .equals("blue"))
                .count());





    }


}
