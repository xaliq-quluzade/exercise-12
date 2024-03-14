package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));

        int result = calculator.add(2, 2);

        assertTrue(result == 4);

        assertFalse(result == 5);

        int[] expectedResults = {4, 7, 25};
        int[] actualResults = {
                calculator.add(2, 2),
                calculator.add(5, 2),
                calculator.add(23, 2)
        };
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));

        int result = calculator.subtract(2, 2);

        assertTrue(result == 0);

        assertFalse(result == 1);
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));

        int result = calculator.multiply(2, 4);

        assertTrue(result == 8);

        assertFalse(result == 9);
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));

        double result = calculator.divide(2, 2);

        assertTrue(result == 1);

        assertFalse(result == 2);

        assertNull(calculator.divide(5, 0));

        assertNotNull(calculator.divide(5, 2));
    }
}
