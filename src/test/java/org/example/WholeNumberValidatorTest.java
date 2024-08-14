package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WholeNumberValidatorTest {

    private final WholeNumberValidator validator = new WholeNumberValidator();

    @Test
    public void testValidWholeNumbers() {
        assertTrue(validator.isValidWholeNumber("123"));   // Sadece rakamlar
        assertTrue(validator.isValidWholeNumber("0"));     // Sıfır
    }

    @Test
    public void testInvalidWholeNumbers() {
        assertFalse(validator.isValidWholeNumber(""));     // Boş dize
        assertFalse(validator.isValidWholeNumber(null));   // null
        assertFalse(validator.isValidWholeNumber("123.0"));// Ondalık sayı
        assertFalse(validator.isValidWholeNumber("abc"));  // Harf içeren dize
        assertFalse(validator.isValidWholeNumber("12a3")); // Karışık dize
    }
}
