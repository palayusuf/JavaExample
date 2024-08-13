package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PhoneNumberValidatorTest {

    PhoneNumberValidator validator = new PhoneNumberValidator();

    @Test
    public void testValidMobileNumbers() {
        assertTrue(validator.validatePhoneNumber("+905555555555"));
        assertTrue(validator.validatePhoneNumber("05555555555"));
        assertTrue(validator.validatePhoneNumber("5555555555"));
    }

    @Test
    public void testInvalidMobileNumbers() {
        assertFalse(validator.validatePhoneNumber("+905155555555"));
        assertFalse(validator.validatePhoneNumber("01555555555"));
        assertFalse(validator.validatePhoneNumber("555555555"));
    }

    @Test
    public void testValidLandlineNumbers() {
        assertTrue(validator.validatePhoneNumber("+902123456789"));
        assertTrue(validator.validatePhoneNumber("02123456789"));
        assertTrue(validator.validatePhoneNumber("2123456789"));
    }

    @Test
    public void testInvalidLandlineNumbers() {
        assertFalse(validator.validatePhoneNumber("+902023456789"));
        assertFalse(validator.validatePhoneNumber("0123456789"));
        assertFalse(validator.validatePhoneNumber("212345678"));
    }

    @Test
    public void testInvalidFormatNumbers() {
        assertFalse(validator.validatePhoneNumber("+90555555A555"));
        assertFalse(validator.validatePhoneNumber("+90212345 6789"));
        assertFalse(validator.validatePhoneNumber("902123456789"));
    }
}
