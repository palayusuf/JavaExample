package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class JsonValidatorTest {

    @Test
    public void testValidJson() throws Exception {
        String jsonFileName = "src/test/resources/test-data.json";
        String jsonData = "[{\"url\":\"http://valid-url.com\",\"phoneNumber\":\"+905551234567\"}]";
        Files.write(Paths.get(jsonFileName), jsonData.getBytes());

        Map<String, Validator> validators = new HashMap<>();
        validators.put("url", new URLValidator());
        validators.put("phoneNumber", new PhoneNumberValidator());

        JsonValidator jsonValidator = new JsonValidator(validators);
        boolean isValid = jsonValidator.validate(jsonFileName);

        assertTrue(isValid);
    }

    @Test
    public void testInvalidJson() throws Exception {
        String jsonFileName = "src/test/resources/test-data-invalid.json";
        String jsonData = "[{\"url\":\"http://invalid-url\",\"phoneNumber\":\"invalid-phone-number\"}]";
        Files.write(Paths.get(jsonFileName), jsonData.getBytes());

        Map<String, Validator> validators = new HashMap<>();
        validators.put("url", new URLValidator());
        validators.put("phoneNumber", new PhoneNumberValidator());

        JsonValidator jsonValidator = new JsonValidator(validators);
        boolean isValid = jsonValidator.validate(jsonFileName);

        assertFalse(isValid);
    }
}
