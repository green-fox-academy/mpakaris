import java.util.Arrays;

public class DoubleItems {

    public static void main(String[] args) {

     int[] numList = {3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(numList));

        for (int i = 0; i < numList.length; i++) {

            numList[i] = numList[i]*2;

        }

        System.out.println("Array Elements doubled: " + Arrays.toString(numList));
    }
}
