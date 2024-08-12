package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeValidatorTest {

    @Test
    public void testValidateDateTimeFormat_ValidFormat() {
        DateTimeValidator validator = new DateTimeValidator();
        String dateTime = "2024-08-12 15:30";
        String format = "yyyy-MM-dd HH:mm";
        assertTrue(validator.validateDateTimeFormat(dateTime, format));
    }

    @Test
    public void testValidateDateTimeFormat_InvalidFormat() {
        DateTimeValidator validator = new DateTimeValidator();
        String dateTime = "12-08-2024 15:30";
        String format = "yyyy-MM-dd HH:mm";
        assertFalse(validator.validateDateTimeFormat(dateTime, format));
    }

    @Test
    public void testValidateDateTimeFormat_EmptyString() {
        DateTimeValidator validator = new DateTimeValidator();
        String dateTime = "";
        String format = "yyyy-MM-dd HH:mm";
        assertFalse(validator.validateDateTimeFormat(dateTime, format));
    }

    @Test
    public void testValidateDateTimeFormat_InvalidDateTime() {
        DateTimeValidator validator = new DateTimeValidator();
        String dateTime = "2024-13-12 25:61";
        String format = "yyyy-MM-dd HH:mm";
        assertFalse(validator.validateDateTimeFormat(dateTime, format));
    }
}

