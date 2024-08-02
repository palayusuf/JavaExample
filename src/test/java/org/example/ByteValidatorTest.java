package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class ByteValidatorTest {

    @Test
    public void testValidByteArrayISO() {
        ByteValidator validator = new ByteValidator("ISO-8859-9");

        byte[] validArray = "Б".getBytes(Charset.forName("ISO-8859-9"));
        assertTrue(validator.isValidByteArray(validArray));
    }

    @Test
    public void testInvalidByteArrayISO() {
        ByteValidator validator = new ByteValidator("ISO-8859-9");

        byte[] validArray = "Б".getBytes(Charset.forName("ISO-8859-9"));
        assertTrue(validator.isValidByteArray(validArray), "Byte array should be valid.");
    }

    @Test
    public void testUnsupportedCharset() {
        Exception exception = assertThrows(UnsupportedCharsetException.class, () -> {
            ByteValidator validator = new ByteValidator("UNSUPPORTED-CHARSET");
            byte[] array = "Б".getBytes(Charset.forName("ISO-8859-9"));
            validator.isValidByteArray(array);
        });

        String expectedMessage = "Unsupported charset: UNSUPPORTED-CHARSET";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
