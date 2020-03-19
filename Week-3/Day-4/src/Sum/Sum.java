package Sum;

public class Sum {

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum.returnSumOfElements(arrayOfNumbers);
    }

    public Sum(){
    }

    public int returnSumOfElements(int[] numbersToAdd){

        int sumOfAllElements = 0;
        for (int line : numbersToAdd) {
            sumOfAllElements += line;
        }
        System.out.println(sumOfAllElements);
        return sumOfAllElements;
    }
}
