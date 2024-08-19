package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocalDateTimeValidatorTest {

    private LocalDateTimeValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new LocalDateTimeValidator("yyyy-MM-dd'T'HH:mm:ss");
    }

    @Test
    public void testValidateWithValidDateTime() {
        assertTrue(validator.validate("2024-08-19T15:30:00"));
        assertTrue(validator.validate("2024-01-01T00:00:00"));
        assertTrue(validator.validate("2024-12-31T23:59:59"));
    }

    @Test
    public void testValidateWithInvalidDateTime() {
        // Geçersiz tarih ve saat verileri
        assertFalse(validator.validate("2024-08-19 15:30:00"));
        assertFalse(validator.validate("2024-08-19T25:30:00"));
        assertFalse(validator.validate("2024-13-19T15:30:00"));
        assertFalse(validator.validate("2024-08-19T15:60:00"));
        assertFalse(validator.validate("2024-08-19T15:30:00.123"));
    }
}
