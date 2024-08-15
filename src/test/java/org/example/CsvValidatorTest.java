package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CsvValidatorTest {

    @Test
    public void testValidCsv() throws IOException {
        Validator[] validators = {
                new DateTimeValidator("yyyy-MM-dd"),
                new PhoneNumberValidator(),
                new IPAddressValidator(),
                new URLValidator()
        };

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-data.csv");
        assertNotNull(inputStream, "CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        CsvValidator csvValidator = new CsvValidator(validators);
        boolean isValid = csvValidator.validate(csvData);

        assertTrue(isValid, "CSV validation should pass with valid data");
    }

    @Test
    public void testInvalidCsv() throws IOException {
        Validator[] validators = {
                new DateTimeValidator("yyyy-MM-dd"),
                new PhoneNumberValidator(),
                new IPAddressValidator(),
                new URLValidator()
        };

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("invalid-test-data.csv");
        assertNotNull(inputStream, "CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        CsvValidator csvValidator = new CsvValidator(validators);
        boolean isValid = csvValidator.validate(csvData);

        assertFalse(isValid, "CSV validation should fail with invalid data");
    }
}
