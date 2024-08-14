package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class URLValidatorTest {

    @Test
    public void testValidURL() {
        URLValidator validator = new URLValidator();
        assertTrue(validator.validate("https://www.example.com"));
        assertTrue(validator.validate("http://example.com"));
        assertTrue(validator.validate("ftp://files.example.com"));
    }

    @Test
    public void testInvalidURL() {
        URLValidator validator = new URLValidator();
        assertFalse(validator.validate("htt://example.com"));
        assertFalse(validator.validate("://example.com"));
        assertFalse(validator.validate("example.com"));
    }
}
