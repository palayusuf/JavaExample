package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberValidatorTest {

    private final NumberValidator validator = new NumberValidator();

    @Test
    public void testValidNumbers() {
        assertTrue(validator.isValidNumber("123"));        // Sadece rakamlar
        assertTrue(validator.isValidNumber("123.456"));    // Ondalık sayı
        assertTrue(validator.isValidNumber("0.123"));      // 0 ile başlayan ondalık
        assertTrue(validator.isValidNumber(".456"));       // Başta 0 olmayan ondalık
    }

    @Test
    public void testInvalidNumbers() {
        assertFalse(validator.isValidNumber(""));          // Boş dize
        assertFalse(validator.isValidNumber(null));        // null
        assertFalse(validator.isValidNumber("123..456"));  // İki ondalık nokta
        assertFalse(validator.isValidNumber("abc"));       // Harf içeren dize
        assertFalse(validator.isValidNumber("123.45.6"));  // Fazla ondalık noktalar
    }
}
