import java.util.Arrays;

public class subINt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(3, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'
    }

    public static int[] subInt(int numberToSearch, int[] inputArray) {

        int[] newArray= new int[inputArray.length];
        int counter =0;

        for (int i = 0; i < inputArray.length; i++) {
            String uj = Integer.toString(numberToSearch);
            String in = Integer.toString(inputArray[i]);
            if(in.contains(uj)) {
                newArray[counter]=i;
                counter++;
            }
        }

        int[] rearray = Arrays.copyOfRange(newArray, 0, counter);
        return rearray;

    }
}