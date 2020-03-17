package Counter;

import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;

/**
 * Created by aze on 2017.03.29..
 */
public class CounterTest {

    Counter c = new Counter();

    @Test
    public void addMore() {
        c.add(5);
        assertEquals(5, c.get());
        System.out.println("Result 1: ");
        System.out.println(c.get());
    }

    @Test
    public void addOne() {
        c.add();
        assertEquals(1, c.get());
        System.out.println("Result 2: ");
        System.out.println(c.get());
    }

    @Test
    public void getZero() {
        assertEquals(0, c.get());
        System.out.println("Result 3: ");
        System.out.println(c.get());
    }


    @Test
    public void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
        System.out.println("Result 4: ");
        System.out.println(c.get());

    }

    @Test
    public void resetToZero() {
        c.add();
        c.reset();
        assertEquals(0, c.get());
        System.out.println("Result 5: ");
        System.out.println(c.get());
    }

    @Test
    public void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
        System.out.println("Result 6: ");
        System.out.println(c.get());
    }
}