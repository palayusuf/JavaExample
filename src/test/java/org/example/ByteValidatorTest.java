package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ByteValidatorTest {

    @Test
    public void testValidByteArray() {
        String validCharacters = "Hello";
        ByteValidator validator = new ByteValidator(validCharacters);

        byte[] validArray = { 'H', 'e', 'l', 'l', 'o' };
        assertTrue(validator.isValidByteArray(validArray));
    }

    @Test
    public void testInvalidByteArray() {
        String validCharacters = "Hello";
        ByteValidator validator = new ByteValidator(validCharacters);

        byte[] invalidArray = { 'H', 'e', 'l', 'l', 'o', '!', '!' };
        assertFalse(validator.isValidByteArray(invalidArray));
    }
}