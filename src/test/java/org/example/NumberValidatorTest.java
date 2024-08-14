package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class NumberValidatorTest {

    @Test
    public void testValidNumber() {
        NumberValidator validator = new NumberValidator();
        assertTrue(validator.validate("123"));        // Sadece rakamlar
        assertTrue(validator.validate("123.45"));    // Ondalıklı rakamlar
    }

    @Test
    public void testInvalidNumber() {
        NumberValidator validator = new NumberValidator();
        assertFalse(validator.validate("abc"));      // Harf içeren giriş
        assertFalse(validator.validate(""));         // Boş, geçerli değil
        assertFalse(validator.validate(null));       // Null, geçerli değil
    }
}
