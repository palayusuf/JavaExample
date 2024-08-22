package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonValidatorTest {

    @Test
    void testValidJson() {
        JsonValidator jsonValidator = new JsonValidator();
        String jsonData = "[{\"url\": \"http://valid-url.com\", \"phoneNumber\": \"+905012345678\"}, " +
                "{\"url\": \"ftp://valid-ftp.com\", \"phoneNumber\": \"02123456789\"}]";

        assertTrue(jsonValidator.validate(jsonData));
    }


    @Test
    void testInvalidPhoneNumber() {
        JsonValidator jsonValidator = new JsonValidator();
        String jsonData = "[{\"url\": \"http://valid-url.com\", \"phoneNumber\": \"invalid-phone\"}]";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            jsonValidator.validate(jsonData);
        });

        assertTrue(exception.getMessage().contains("Invalid phone number"));
    }

    @Test
    void testNullUrl() {
        JsonValidator jsonValidator = new JsonValidator();
        String jsonData = "[{\"url\": null, \"phoneNumber\": \"+905012345678\"}]";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            jsonValidator.validate(jsonData);
        });

        assertTrue(exception.getMessage().contains("Invalid URL"));
    }

    @Test
    void testNullPhoneNumber() {
        JsonValidator jsonValidator = new JsonValidator();
        String jsonData = "[{\"url\": \"http://valid-url.com\", \"phoneNumber\": null}]";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            jsonValidator.validate(jsonData);
        });

        assertTrue(exception.getMessage().contains("Invalid phone number"));
    }

    @Test
    void testMalformedJson() {
        JsonValidator jsonValidator = new JsonValidator();
        String jsonData = "[{\"url\": \"http://valid-url.com\", \"phoneNumber\": \"+905012345678\"}";

        Exception exception = assertThrows(RuntimeException.class, () -> {
            jsonValidator.validate(jsonData);
        });

        assertTrue(exception.getMessage().contains("Invalid JSON data"));
    }
}
