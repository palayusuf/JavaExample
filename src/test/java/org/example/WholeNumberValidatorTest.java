package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class WholeNumberValidatorTest {

    @Test
    public void testValidWholeNumber() {
        WholeNumberValidator validator = new WholeNumberValidator();
        assertTrue(validator.validate("123")); // Sadece rakamlar
        assertTrue(validator.validate("0"));   // Tek rakam, geçerli bir bütün sayı
    }

    @Test
    public void testInvalidWholeNumber() {
        WholeNumberValidator validator = new WholeNumberValidator();
        assertFalse(validator.validate("123.45")); // Ondalık sayı, geçerli değil
        assertFalse(validator.validate("abc")); // Harfler, geçerli değil
        assertFalse(validator.validate("")); // Boş, geçerli değil
        assertFalse(validator.validate(null)); // Null, geçerli değil
    }
}
