package org.example;
import org.example.DateTimeValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeValidatorTest {

    @Test
    public void testValidateDateTimeFormat_ValidFormat() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd HH:mm");
        boolean isValid = validator.validateDateTimeFormat("2024-08-12 15:30");
        assertTrue(isValid, "The date-time should be valid.");
    }

    @Test
    public void testValidateDateTimeFormat_InvalidFormat() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd HH:mm");
        boolean isValid = validator.validateDateTimeFormat("12-08-2024 15:30");
        assertFalse(isValid, "The date-time should be invalid.");
    }

    @Test
    public void testValidateDateTimeFormat_EmptyString() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd HH:mm");
        boolean isValid = validator.validateDateTimeFormat("");
        assertFalse(isValid, "The date-time should be invalid.");
    }

    @Test
    public void testValidateDateTimeFormat_InvalidDateTime() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd HH:mm");
        boolean isValid = validator.validateDateTimeFormat("2024-13-12 25:61"); // Geçersiz tarih ve saat
        assertFalse(isValid, "The date-time should be invalid.");
    }

    @Test
    public void testValidateDateTimeFormat_InvalidDateTimeInvalidDay() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd");
        boolean isValid = validator.validateDateTimeFormat("2024-02-30");
        assertFalse(isValid, "The date-time should be invalid.");
    }
}
