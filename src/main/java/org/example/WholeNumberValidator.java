package org.example;

public class WholeNumberValidator {

    public boolean isValidWholeNumber(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String wholeNumberPattern = "\\d+";
        return input.matches(wholeNumberPattern);
    }
}