package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    @Test
    public void testValidMobileNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertTrue(validator.validatePhoneNumber("+905301234567"));
        assertTrue(validator.validatePhoneNumber("05301234567"));
        assertTrue(validator.validatePhoneNumber("5301234567"));
    }

    @Test
    public void testInvalidMobileNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertFalse(validator.validatePhoneNumber("+9054012345678"));
        assertFalse(validator.validatePhoneNumber("0540123456"));
        assertFalse(validator.validatePhoneNumber("+905a01234567"));
    }

    @Test
    public void testValidLandlineNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertTrue(validator.validatePhoneNumber("02123456789"));
        assertTrue(validator.validatePhoneNumber("03121234567"));
        assertTrue(validator.validatePhoneNumber("04123456789"));
        assertTrue(validator.validatePhoneNumber("08504841674"));

    }

    @Test
    public void testInvalidLandlineNumbers() {
        PhoneNumberValidator validator = new PhoneNumberValidator();

        assertFalse(validator.validatePhoneNumber("+901123456789"));
        assertFalse(validator.validatePhoneNumber("212345678"));
        assertFalse(validator.validatePhoneNumber("21234567890"));
        assertFalse(validator.validatePhoneNumber("21234a6789"));
    }
}
