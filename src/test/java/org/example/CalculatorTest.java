package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator hm = new Calculator();
        assertEquals(7, hm.add(3, 4), "Toplama işlemi doğru değil");
        assertEquals(-1, hm.add(-3, 2), "Toplama işlemi doğru değil");
    }

    @Test
    public void testMultiplication() {
        Calculator hm = new Calculator();
        assertEquals(12, hm.multiply(3, 4), "Çarpma işlemi doğru değil");
        assertEquals(-6, hm.multiply(-3, 2), "Çarpma işlemi doğru değil");
    }

    @Test
    public void testDivision() {
        Calculator hm = new Calculator();
        assertEquals(2, hm.divide(10, 5), "Bölme işlemi doğru değil");
        assertEquals(-3, hm.divide(-9, 3), "Bölme işlemi doğru değil");

        assertEquals(0, hm.divide(10, 0), "Bölme sıfır ile bölünememeli");
    }

    @Test
    public void testSubtraction() {
        Calculator hm = new Calculator();
        assertEquals(-1, hm.subtract(3, 4), "Çıkarma işlemi doğru değil");
        assertEquals(-5, hm.subtract(-3, 2), "Çıkarma işlemi doğru değil");
    }
}

