package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator hm = new Calculator();
        assertEquals(7, hm.add(3, 4), "Addition is not correct");
        assertEquals(-1, hm.add(-3, 2), "Addition is not correct");
    }

    @Test
    public void testMultiplication() {
        Calculator hm = new Calculator();
        assertEquals(12, hm.multiply(3, 4), "Multiplication is not correct");
        assertEquals(-6, hm.multiply(-3, 2), "Multiplication is not correct");
    }

    @Test
    public void testDivision() {
        Calculator hm = new Calculator();
        assertEquals(2, hm.divide(10, 5), "Division is not correct");
        assertEquals(-3, hm.divide(-9, 3), "Division is not correct");

        assertEquals(0, hm.divide(10, 0), "Division should not be divided by zero");
    }

    @Test
    public void testSubtraction() {
        Calculator hm = new Calculator();
        assertEquals(-1, hm.subtract(3, 4), "Subtraction is not correct");
        assertEquals(-5, hm.subtract(-3, 2), "Subtraction is not correct");
    }
}

