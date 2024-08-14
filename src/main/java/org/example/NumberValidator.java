package org.example;

public class NumberValidator implements Validator {

    @Override
    public boolean validate(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String numberPattern = "\\d*\\.?\\d+";
        return input.matches(numberPattern);
    }
}
