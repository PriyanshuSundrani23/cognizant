package com.cognizant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAATest {
    private int value;

    @Before
    public void setUp() {
        System.out.println("Setting up test fixture...");
        value = 10;
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down test fixture...");
        value = 0;
    }

    @Test
    public void testAddition() {
        // Arrange
        int expected = 15;
        int operand = 5;

        // Act
        int actual = value + operand;

        // Assert
        assertEquals(expected, actual);
    }
}
