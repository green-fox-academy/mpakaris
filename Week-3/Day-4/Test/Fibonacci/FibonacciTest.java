import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void createsFibonacciNumber() {

        Fibonacci fibonacciSequenz = new Fibonacci();
        int index = 9;

        assertEquals(34, fibonacciSequenz.createsFibonacciNumber(index));



    }
}