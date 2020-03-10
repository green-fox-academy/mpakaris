import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Bubble {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        System.out.println(Arrays.toString(AdvancedBubble(bubble(new int[] {34, 12, 24, 9, 5}))));
    }

    public static int[] bubble(int[] arrayFromMain) {
       Arrays.sort(arrayFromMain);
       return arrayFromMain;
    }

    public static int[] AdvancedBubble(int[] arrayFromMain){

        //Why is this Arrays.sort method not working??
        Arrays.sort(arrayFromMain, Collections.reverseOrder());

        return arrayFromMain;
    }

}
