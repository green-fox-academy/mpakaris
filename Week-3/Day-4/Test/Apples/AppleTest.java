package Apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getApple() {

        Apple apple = new Apple();

        String expectedAnswer = "Apple";
        String methodOfExpectedAnswer = apple.getApple();

        assertEquals(expectedAnswer, methodOfExpectedAnswer);

    }
}