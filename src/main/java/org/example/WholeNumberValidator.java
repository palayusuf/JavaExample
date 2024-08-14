package org.example;

public class WholeNumberValidator implements Validator {

    @Override
    public boolean validate(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String wholeNumberPattern = "\\d+";
        return input.matches(wholeNumberPattern);
    }
}
