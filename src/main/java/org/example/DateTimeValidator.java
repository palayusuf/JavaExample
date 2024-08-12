package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeValidator {

    DateTimeFormatter formatter;

    public DateTimeValidator(String format) {
        this.formatter = DateTimeFormatter.ofPattern(format);
    }

    public boolean validateDateTimeFormat(String dateTime) {
        try {
            LocalDateTime.parse(dateTime, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
