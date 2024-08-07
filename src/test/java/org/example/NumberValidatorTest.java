package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class NumberValidatorTest {
    @Test
    public void testValidNumber() {
        NumberValidator validator = new NumberValidator();
        assertTrue(validator.isValidNumber("123"));
        assertTrue(validator.isValidNumber("0"));
        assertTrue(validator.isValidNumber("123.45"));
        assertTrue(validator.isValidNumber(".45"));
        assertTrue(validator.isValidNumber("0.45"));
    }

    @Test
    public void testInvalidNumber() {
        NumberValidator validator = new NumberValidator();
        assertFalse(validator.isValidNumber("12a3"));
        assertFalse(validator.isValidNumber("123..45"));
        assertFalse(validator.isValidNumber(""));
        assertFalse(validator.isValidNumber(null));
        assertFalse(validator.isValidNumber("123.45.67"));
    }
}
