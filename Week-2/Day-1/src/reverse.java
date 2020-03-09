import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {

    public static void main(String[] args) {
        System.out.println(" ");
        int[] aj = {3, 4, 5, 6, 7};
        System.out.println("Before: " + Arrays.toString(aj));

        // swaps first with last element, second with one before last, etc.
        // Trick: Only goes till mid-length for Array!!
        for(int i=0; i<aj.length/2; i++){
            int temp = aj[i];
            aj[i] = aj[aj.length -i -1];
            aj[aj.length -i -1] = temp;
        }
        System.out.println();
        System.out.println("After: " + Arrays.toString(aj));

        //2nd Solution: Array to List, reverse List and then save as Array
           

    }
}
