package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CsvValidatorTest {

    @Test
    public void testValidCsv() throws IOException {
        Map<Integer, Validator> validatorsMap = new HashMap<>();
        validatorsMap.put(2, new LocalDateTimeValidator("yyyy-MM-dd"));
        validatorsMap.put(3, new PhoneNumberValidator());
        validatorsMap.put(4, new IPAddressValidator());
        validatorsMap.put(5, new URLValidator());

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-data.csv");
        assertNotNull(inputStream, "CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        CsvValidator csvValidator = new CsvValidator(validatorsMap);
        boolean isValid = csvValidator.validate(csvData);

        assertTrue(isValid, "CSV validation should pass with valid data");
    }

    @Test
    public void testInvalidCsv() throws IOException {
        Map<Integer, Validator> validatorsMap = new HashMap<>();
        validatorsMap.put(2, new LocalDateTimeValidator("yyyy-MM-dd"));
        validatorsMap.put(3, new PhoneNumberValidator());
        validatorsMap.put(4, new IPAddressValidator());
        validatorsMap.put(5, new URLValidator());

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("invalid-test-data.csv");
        assertNotNull(inputStream, "CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        CsvValidator csvValidator = new CsvValidator(validatorsMap);
        boolean isValid = csvValidator.validate(csvData);

        assertFalse(isValid, "CSV validation should fail with invalid data");
    }
}
