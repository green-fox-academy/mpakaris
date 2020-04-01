package MutualElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import static MutualElements.MutualElementsMain.findMutualElements;

public class MutualElementsMain {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 4));
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(3, 4, 4, 5, 6));
        System.out.println(findMutualElements(a, b));
    }

    public static List<Integer> findMutualElements(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> mutualElementsTemp  = new ArrayList<>();
        for (Integer elementOfA : a) {
            for (Integer elementOfB : b) {
                if (elementOfA == elementOfB) {
                    mutualElementsTemp.add(elementOfA);
                }
            }
        }
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(mutualElementsTemp);
        List<Integer> mutualElementsFinal = new ArrayList<>(hashSet);
        return mutualElementsFinal;
    }
}
