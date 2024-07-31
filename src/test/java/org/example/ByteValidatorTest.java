package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ByteValidatorTest {
    @Test
    public void testValidByteArray() {
        byte[] validArray = {'A', 'B', 'C'};
        String validCharacters = "ABC";
        assertTrue(ByteValidator.isValidByteArray(validArray, validCharacters));
    }

    @Test
    public void testInvalidByteArray() {
        byte[] invalidArray = {'A', 'B', 'D'};
        String validCharacters = "ABC";
        assertFalse(ByteValidator.isValidByteArray(invalidArray, validCharacters));
    }
}
