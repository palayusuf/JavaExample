package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ByteValidatorTest {

    @Test
    public void testValidByteArrayISO() {
        ByteValidator validator = new ByteValidator("ISO-8859-9");

        byte[] validArray = "öşğüçı".getBytes();
        assertTrue(validator.isValidByteArray(validArray));
    }

    @Test
    public void testInvalidByteArrayUTF8() {
        ByteValidator validator = new ByteValidator("UTF-8");

        byte[] invalidArray = {(byte) 0xC3, (byte) 0x28};
        assertFalse(validator.isValidByteArray(invalidArray));
    }

    @Test
    public void testValidByteArrayUTF8() {
        ByteValidator validator = new ByteValidator("UTF-8");

        byte[] validArray = "öşğüçı".getBytes();
        assertTrue(validator.isValidByteArray(validArray));
    }

    @Test
    public void testUnsupportedCharset() {
        ByteValidator validator = new ByteValidator("UNSUPPORTED-CHARSET");

        byte[] array = "öşğüçı".getBytes();
        assertFalse(validator.isValidByteArray(array));
    }
}