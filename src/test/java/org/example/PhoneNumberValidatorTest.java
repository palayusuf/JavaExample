package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    @Test
    public void testValidMobileNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertTrue(validator.validate("+905301234567"));
        assertTrue(validator.validate("05301234567"));
        assertTrue(validator.validate("5301234567"));
    }

    @Test
    public void testInvalidMobileNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertFalse(validator.validate("+9054012345678"));
        assertFalse(validator.validate("0540123456"));
        assertFalse(validator.validate("+905a01234567"));
    }

    @Test
    public void testValidLandlineNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertTrue(validator.validate("02123456789"));
        assertTrue(validator.validate("03121234567"));
        assertTrue(validator.validate("04123456789"));
        assertTrue(validator.validate("08504841674"));

    }

    @Test
    public void testInvalidLandlineNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertFalse(validator.validate("+901123456789"));
        assertFalse(validator.validate("212345678"));
        assertFalse(validator.validate("21234567890"));
        assertFalse(validator.validate("21234a6789"));
    }
}
