package Sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void returnSumOfElements() {

        int[] arrayToBeTested = {10, 20, 30, 40, 50};
        Sum sum = new Sum();
        int expectedSum = 150;
        assertEquals(expectedSum, sum.returnSumOfElements(arrayToBeTested));
    }

    @Test
    public void returnSumOfElementsWhenArray_empty() {

        int[] arrayToBeTested = {};
        Sum sum = new Sum();
        int expectedSum = 0;
        assertEquals(expectedSum, sum.returnSumOfElements(arrayToBeTested));
    }

    @Test
    public void returnSumOfElementsWhenArray_oneElement() {

        int[] arrayToBeTested = {1};
        Sum sum = new Sum();
        int expectedSum = 1;
        assertEquals(expectedSum, sum.returnSumOfElements(arrayToBeTested));
    }

    @Test
    public void returnSumOfElementsWhenArray_multipleElements() {

        int[] arrayToBeTested = {1, 3, 5, 6, 8, 0, 0};
        Sum sum = new Sum();
        int expectedSum = 23;
        assertEquals(expectedSum, sum.returnSumOfElements(arrayToBeTested));
    }

    /*@Test
    public void returnSumOfElementsWhenArray_null() {

        int[] arrayToBeTested = {0};
        Sum sum = new Sum();
        int expectedSum = ;
        assertEquals(expectedSum, sum.returnSumOfElements(arrayToBeTested));
    }*/

}