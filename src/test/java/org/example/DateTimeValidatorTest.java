package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTimeValidatorTest {

    @Test
    void testValidDate() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd");

        assertTrue(validator.validate("1985-10-15"), "Valid date should pass validation.");
        assertTrue(validator.validate("2000-01-01"), "Valid date should pass validation.");
        assertTrue(validator.validate("1992-03-25"), "Valid date should pass validation.");
    }

    @Test
    void testInvalidDate() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd");

        assertFalse(validator.validate("1985-15-10"), "Invalid month should fail validation.");
        assertFalse(validator.validate("abcd-ef-gh"), "Non-date strings should fail validation.");
        assertFalse(validator.validate("1985/10/15"), "Wrong date format should fail validation.");
    }

    @Test
    void testEmptyOrNullDate() {
        DateTimeValidator validator = new DateTimeValidator("yyyy-MM-dd");

        assertFalse(validator.validate(""), "Empty string should fail validation.");
    }
}
