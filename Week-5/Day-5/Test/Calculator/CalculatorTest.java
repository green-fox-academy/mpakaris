package Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTwoNumber() {
        Calculator calc = new Calculator();
        int sum = calc.addTwoNumber(2, 3);
        assertEquals(5, sum);
    }

    @Test
    public void multiplyTwoNumbers() {
    }

    @Test
    public void divideTwoNumbers() {
    }
}