package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneConverter {
    public LocalDateTime convertInstantToLocalDateTime(Instant instant, String timeZone) {

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of(timeZone));
        return zonedDateTime.toLocalDateTime();
    }
}
