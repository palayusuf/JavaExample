package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class JsonValidatorTest {

    @Test
    public void testValidateJsonFile() throws IOException {
        Validator phoneNumberValidator = mock(Validator.class);
        Validator urlValidator = mock(Validator.class);

        when(phoneNumberValidator.validate("5551234567")).thenReturn(true);
        when(phoneNumberValidator.validate("0000000000")).thenReturn(false);
        when(urlValidator.validate("http://valid-url.com")).thenReturn(true);
        when(urlValidator.validate("htp://invalid-url")).thenReturn(false);

        Map<String, Validator> validators = Map.of(
                "phoneNumber", phoneNumberValidator,
                "url", urlValidator
        );

        String jsonContent = "[{\"phoneNumber\": \"5551234567\", \"url\": \"http://valid-url.com\"}, " +
                "{\"phoneNumber\": \"0000000000\", \"url\": \"htp://invalid-url\"}]";

        Files.write(Paths.get("test-data.json"), jsonContent.getBytes());

        JsonValidator jsonValidator = new JsonValidator(validators);

        jsonValidator.validateJsonFile("test-data.json");

        verify(phoneNumberValidator).validate("5551234567");
        verify(phoneNumberValidator).validate("0000000000");
        verify(urlValidator).validate("http://valid-url.com");
        verify(urlValidator).validate("htp://invalid-url");

    }
}
