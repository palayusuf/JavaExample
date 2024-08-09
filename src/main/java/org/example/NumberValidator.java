package org.example;

public class NumberValidator {
    public boolean isValidNumber(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        boolean decimalPointFound = false;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c == '.') {
                if (decimalPointFound) {
                    return false;
                }
                decimalPointFound = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}