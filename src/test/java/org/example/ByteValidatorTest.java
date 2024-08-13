package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class ByteValidatorTest {

    @Test
    public void testValidByteArrayISO() {
        ByteValidator validator = new ByteValidator("ISO-8859-9");

        byte[] validArray = "Б".getBytes();
        assertTrue(validator.isValidByteArray(validArray));
    }

    @Test
    void testIsValidByteArray_False() {
        ByteValidator instance = new ByteValidator("UTF-8");

        // Use a byte array that is not valid for ISO-8859-9
        byte[] invalidByteArray = {(byte) 0xFF, (byte) 0xFF}; // 0xFF is often invalid in single-byte charsets

        // Call the method and assert that it returns false
        assertFalse(instance.isValidByteArray(invalidByteArray));
    }
    @Test
    public void testUnsupportedCharset() {
        Exception exception = assertThrows(UnsupportedCharsetException.class, () -> {
            ByteValidator validator = new ByteValidator("UNSUPPORTED-CHARSET");
            byte[] array = "Б".getBytes();
            validator.isValidByteArray(array);
        });

        String expectedMessage = "Unsupported charset: UNSUPPORTED-CHARSET";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
