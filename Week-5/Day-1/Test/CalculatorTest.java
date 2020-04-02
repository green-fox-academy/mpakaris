import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void setHappy() {
        Calculator calculator = new Calculator();
        calculator.setHappy(2);
        assertEquals(true, calculator.ishappy);


    }
}