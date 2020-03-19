
public class Fibonacci {

    public int createsFibonacciNumber(int index){
        if (index == 0) return 0;
        if (index == 1) return 1;
        return createsFibonacciNumber(index - 1) + createsFibonacciNumber(index - 2);
    }

    public static void main(String[] args) {

        Fibonacci index = new Fibonacci();
        int indexToUse = 9;
        System.out.println("Fibonacci Number " + index.createsFibonacciNumber(indexToUse));
    }
}
