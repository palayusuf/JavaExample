package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public CsvReader() {
    }

    public List<String[]> readCsv(InputStream inputStream) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        }
        return data;
    }
}
