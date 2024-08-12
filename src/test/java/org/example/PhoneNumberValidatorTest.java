package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    @Test
    public void testValidatePhoneNumber_ValidPhoneNumberWithCountryCode() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValid = validator.validatePhoneNumber("+905551234567");
        assertTrue(isValid, "The phone number with country code should be valid.");
    }

    @Test
    public void testValidatePhoneNumber_ValidPhoneNumberWithLeadingZero() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValid = validator.validatePhoneNumber("05551234567");
        assertTrue(isValid, "The phone number with leading zero should be valid.");
    }

    @Test
    public void testValidatePhoneNumber_InvalidPhoneNumberTooShort() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValid = validator.validatePhoneNumber("0555123456");
        assertFalse(isValid, "The phone number should be invalid because it is too short.");
    }

    @Test
    public void testValidatePhoneNumber_InvalidPhoneNumberWithInvalidPrefix() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValid = validator.validatePhoneNumber("01351234567");
        assertFalse(isValid, "The phone number should be invalid because it starts with an invalid prefix.");
    }

    @Test
    public void testValidatePhoneNumber_EmptyString() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValid = validator.validatePhoneNumber("");
        assertFalse(isValid, "The phone number should be invalid because it is empty.");
    }
}
