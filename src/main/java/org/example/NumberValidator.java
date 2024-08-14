package org.example;

public class NumberValidator {

    public boolean isValidNumber(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String numberPattern = "\\d*\\.?\\d+";
        return input.matches(numberPattern);
    }
}
