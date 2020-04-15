import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testing {
    public static void main(String[] args) {
       /* List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(" "));
        System.out.println("Merged String: " + mergedString);

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set); */

        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("Pamela", 24),
                        new Person("David", 12));

        Map<Integer, List<Person>> personsByAge =
                persons
                    .stream()
                    .collect(Collectors.groupingBy(p -> p.age));

        System.out.println(personsByAge);
        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

        System.out.println("------------------");
        String phrase = persons
            .stream()
            .filter(p -> p.age >= 18)
            .map(p -> p.name)
            .collect(Collectors.joining(" and ", "In Germany, ", " are of legal age."));
        System.out.println(phrase);
        System.out.println("------------------");

        Map<Integer, String> map = persons
            .stream()
            .collect(Collectors.toMap(
                    p -> p.age,
                    p -> p.name,
                    (name1, name2) -> name1 + " | " + name2));
        System.out.println(map);
        System.out.println("------------------");

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),  // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                        (j1, j2) -> j1.merge(j2),               // combiner
                        StringJoiner::toString);                // finisher

        String names = persons
                .stream()
                .collect(personNameCollector);

        System.out.println(names);
















    }
}

