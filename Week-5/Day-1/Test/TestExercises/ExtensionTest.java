package TestExercises;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

    @Test
    void testAdd_2and3is5() {
        Extension extension = new Extension();
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_2and3is5_shouldFail() {
        Extension extension = new Extension();
        assertEquals(5, extension.add(2, 9));
    }

    @Test
    void testAdd_1and4is5() {
        Extension extension = new Extension();
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        Extension extension = new Extension();
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        Extension extension = new Extension();
        assertEquals(7, extension.maxOfThree(7, 4, 5));
    }

    @Test
    void testMedian_four() {
        Extension extension = new Extension();
        assertEquals(10, extension.median(Arrays.asList(10,10,10,10, 10, 10)));
    }

    @Test
    void testMedian_five() {
        Extension extension = new Extension();
        assertEquals(5, extension.median(Arrays.asList(6,2,3,4,5)));
    }

    @Test
    void testIsVowel_a() {
        Extension extension = new Extension();
        boolean vowerl = extension.isVowel('a');
        assertEquals(true, vowerl);
    }

    @Test
    void testIsVowel_u() {
        Extension extension = new Extension();
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        Extension extension = new Extension();
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        Extension extension = new Extension();
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}