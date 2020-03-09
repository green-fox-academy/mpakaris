import com.sun.source.tree.ClassTree;
import java.lang.reflect.Array;
import java.util.Arrays;

public class swapElements {
    public static void main(String[] args) {
        System.out.println();

        String[] abc = {"first", "second", "third"};

        String firstElement = abc[0];
        String thirdElement = abc[2];

        System.out.println(Arrays.toString(abc));
        System.out.println("First Element: "+firstElement);
        System.out.println("Third Element: "+thirdElement);

        for (int i = 0; i < abc.length ; i++) {
            if (i == 0) {
                abc[i] = thirdElement;
            }
            if (i==2) {
                abc[i] = firstElement;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(abc));
        firstElement = abc[0];
        thirdElement = abc[2];
        System.out.println("First Element: "+ firstElement);
        System.out.println("Third Element: "+ thirdElement);
    }
}
