package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WholeNumberValidatorTest {
    @Test
    public void testValidWholeNumber() {
        WholeNumberValidator validator = new WholeNumberValidator();
        assertTrue(validator.isValidWholeNumber("123"));
        assertTrue(validator.isValidWholeNumber("0"));
    }

    @Test
    public void testInvalidWholeNumber() {
        WholeNumberValidator validator = new WholeNumberValidator();
        assertFalse(validator.isValidWholeNumber("123.45"));
        assertFalse(validator.isValidWholeNumber("12a3"));
        assertFalse(validator.isValidWholeNumber(""));
        assertFalse(validator.isValidWholeNumber(null));
    }
}

