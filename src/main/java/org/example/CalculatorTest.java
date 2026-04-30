package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 2);

        assertEquals(3, result);
    }
}