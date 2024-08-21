package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OffsetDateTimeValidatorTest {
    private OffsetDateTimeValidator offsetDateTimeValidator;

    @BeforeEach
    public void setUp() {
        offsetDateTimeValidator = new OffsetDateTimeValidator();
    }

    @Test
    public void testValidOffsetDateTime() {
        String validDateTime1 = "2024-08-20T10:15:30+03:00";
        String validDateTime2 = "2024-08-20T10:15:30Z";
        String validDateTime3 = "2024-08-20T10:15:30-05:00";

        assertTrue(offsetDateTimeValidator.isValidOffsetDateTime(validDateTime1));
        assertTrue(offsetDateTimeValidator.isValidOffsetDateTime(validDateTime2));
        assertTrue(offsetDateTimeValidator.isValidOffsetDateTime(validDateTime3));
    }

    @Test
    public void testInvalidOffsetDateTimeFormat() {
        String invalidFormat1 = "2024-08-20 10:15:30";
        String invalidFormat2 = "2024/08/20T10:15:30+03:00";
        String invalidFormat3 = "10:15:30+03:00";

        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidFormat1));
        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidFormat2));
        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidFormat3));
    }

    @Test
    public void testInvalidOffsetDateTimeValue() {
        String invalidDateTime1 = "2024-08-20T10:15:30+25:00";
        String invalidDateTime2 = "2024-02-30T10:15:30+03:00";
        String invalidDateTime3 = "2024-08-20T10:15:30+02:61";

        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidDateTime1));
        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidDateTime2));
        assertFalse(offsetDateTimeValidator.isValidOffsetDateTime(invalidDateTime3));
    }
}
