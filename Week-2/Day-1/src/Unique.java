import java.util.*;
import java.util.Map.Entry;

public class Unique {
    public static void main(String[] args) {

        int[] arrayMain = {1, 11, 34, 11, 52, 61, 1, 34};
        //Unique(arrayMain);
        System.out.println(Arrays.toString(Unique(arrayMain)));
    }

    public static int[] Unique(int[] arrayFromMain) {

        int[] sortedArray = new int[arrayFromMain.length];
        int counter = 1;
        //System.out.println(Arrays.toString(arrayFromMain));
        Arrays.sort(arrayFromMain); // sort to [1, 1, 11, 11, 34, 34, 52, 61]
        //System.out.println(Arrays.toString(arrayFromMain));

        //First Element of newArray must be same Element as oldArray
        sortedArray[0] = arrayFromMain[0];

        //re-write newArray with only Unique-elements!
        for (int i = 1; i < arrayFromMain.length; i++) {
            if (arrayFromMain[i] != arrayFromMain[i-1]){
                sortedArray[counter] = arrayFromMain[i];
                counter++;
            }
        }

        int[] returnArray = Arrays.copyOfRange(sortedArray, 0, counter);
        return returnArray;
    }
}
