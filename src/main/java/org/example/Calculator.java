package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Adding {} and {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.info("Subtracting {} from {}", b, a);
        return a - b;
    }
}