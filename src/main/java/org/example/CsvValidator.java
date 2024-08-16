package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class CsvValidator {

    private final Map<Integer, Validator> validatorsMap;

    public CsvValidator(Validator[] validators) {
        validatorsMap = new HashMap<>();
        validatorsMap.put(2, validators[0]); // DateTimeValidator
        validatorsMap.put(3, validators[1]); // PhoneNumberValidator
        validatorsMap.put(4, validators[2]); // IPAddressValidator
        validatorsMap.put(5, validators[3]); // URLValidator
    }

    public boolean validate(List<String[]> data) {
        if (data.isEmpty()) return false;

        // Skip header
        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);
            System.out.println("Validating row " + i + ": " + String.join(", ", row));
            if (!isValidRow(row)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidRow(String[] row) {
        for (Map.Entry<Integer, Validator> entry : validatorsMap.entrySet()) {
            int columnIndex = entry.getKey();
            Validator validator = entry.getValue();
            if (columnIndex < row.length) {
                String value = row[columnIndex].trim();
                boolean valid = validator.validate(value);
                System.out.println("Validation for column " + columnIndex + " with value '" + value + "': " + valid);
                if (!valid) {
                    System.out.println("Validation failed for column " + columnIndex + ": " + value);
                    return false;
                }
            } else {
                System.out.println("Column index " + columnIndex + " out of bounds for row length " + row.length);
                return false;
            }
        }
        return true;
    }
}
