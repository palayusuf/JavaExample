package org.example;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class OffsetDateTimeValidator {
    public boolean isValidOffsetDateTime(String dateTime) {
        try {
            OffsetDateTime parsedDateTime = OffsetDateTime.parse(dateTime);
            return parsedDateTime.getOffset().getTotalSeconds() % 3600 == 0; // Offset sadece tam saat olmalı
        } catch (DateTimeParseException e) {
            return false;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
