package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {



    @Test
    void add() {
        int result = SimpleCalculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void subtract() {
        int result = SimpleCalculator.subtract(5, 3);
        assertEquals(2, result);

    }

    @Test
    void multiply() {
        int result = SimpleCalculator.multiply(5, 3);
        assertEquals(15, result);

    }

    @Test
    void divide() {
        double result = SimpleCalculator.divide(4,2);
        assertEquals(2, result);

    }

    @Test
    public void whenContainsWords_thenCorrect() {
        boolean containsWords = WordUtils
                .containsAllWords("String to search", "to", "search");

        assertTrue(containsWords);
    }
}