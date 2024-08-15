package org.example;

import java.util.List;

public class CsvValidator {

    final Validator[] validators;

    public CsvValidator(Validator[] validators) {
        this.validators = validators;
    }

    public boolean validate(List<String[]> data) {
        if (data.isEmpty()) return false;

        // Skip header
        for (int i = 1; i < data.size(); i++) {
            String[] columns = data.get(i);
            System.out.println("Validating row " + i + ": " + String.join(", ", columns));
            if (!isValidRow(columns)) {
                return false;
            }
        }
        return true;
    }

    boolean isValidRow(String[] columns) {
        if (columns.length < validators.length) {
            System.out.println("Invalid number of columns: " + columns.length);
            return false;
        }

        for (int j = 0; j < validators.length; j++) {
            boolean valid = validators[j].validate(columns[j].trim());
            System.out.println("Validation for column " + j + " with value '" + columns[j].trim() + "': " + valid);
            if (!valid) {
                System.out.println("Validation failed for column " + j + ": " + columns[j]);
                return false;
            }
        }
        return true;
    }
}
