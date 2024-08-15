package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CsvReaderTest {

    @Test
    public void testReadCsv() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test-data.csv");
        assertNotNull(inputStream, "CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        assertEquals(7, csvData.size(), "There should be seven rows of data in the CSV, including header");

        assertArrayEquals(new String[]{"name", "surname", "dateOfBirth", "phoneNumber", "ipAddress", "url"}, csvData.get(0));
        assertArrayEquals(new String[]{"John", "Doe", "1985-10-15", "+905321234567", "192.168.1.1", "http://example.com"}, csvData.get(1));
        assertArrayEquals(new String[]{"Alice", "Smith", "1992-03-25", "5327654321", "10.0.0.1", "https://example.org"}, csvData.get(2));
        assertArrayEquals(new String[]{"Eve", "Johnson", "2000-01-01", "5339876543", "172.16.0.1", "http://example.net"}, csvData.get(3));
        assertArrayEquals(new String[]{"Bob", "Brown", "1995-05-22", "5551234567", "203.0.113.1", "https://www.valid-url.com"}, csvData.get(4));
        assertArrayEquals(new String[]{"Tom", "Harris", "1988-12-30", "5055555555", "192.0.2.1", "http://test-url.com"}, csvData.get(5));
        assertArrayEquals(new String[]{"Jhonny", "Bravo", "1992-08-01", "5537414163", "172.16.0.1", "http://example.net"}, csvData.get(6));
    }

    @Test
    public void testReadEmptyCsv() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("empty-test-data.csv");
        assertNotNull(inputStream, "Empty CSV file should be found in resources");

        CsvReader csvReader = new CsvReader();
        List<String[]> csvData = csvReader.readCsv(inputStream);

        assertTrue(csvData.isEmpty(), "The CSV data should be empty");
    }
}
