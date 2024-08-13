package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class URLValidatorTest {

    URLValidator validator = new URLValidator();

    @Test
    public void testValidURLs() {
        assertTrue(validator.isValidURL("https://www.example.com"));
        assertTrue(validator.isValidURL("http://example.com"));
        assertTrue(validator.isValidURL("ftp://example.com/file.txt"));
        assertTrue(validator.isValidURL("file:///C:/path/to/file.txt"));
    }

    @Test
    public void testInvalidURLs() {
        assertFalse(validator.isValidURL("htt://example.com"));
        assertFalse(validator.isValidURL("http://example"));
        assertFalse(validator.isValidURL("example.com"));
        assertFalse(validator.isValidURL("http:// example.com"));
    }

    @Test
    public void testURLsContainingLetters() {
        assertFalse(validator.isValidURL("http://www.exa mple.com"));
        assertFalse(validator.isValidURL("https://example.c0m"));
    }

    @Test
    public void testURLsStartingWith0000() {
        assertFalse(validator.isValidURL("http://0000.example.com"));
    }
}
