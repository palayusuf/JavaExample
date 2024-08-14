package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeZoneConverterTest {

    @Test
    public void testConvertInstantToNewYork() {
        Instant fixedInstant = Instant.parse("2024-08-08T05:15:00Z");
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "America/New_York");
        LocalDateTime expected = LocalDateTime.of(2024, 8, 8, 1, 15);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToLosAngeles() {
        Instant fixedInstant = Instant.parse("2024-08-08T04:15:00Z");
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "America/Los_Angeles");
        LocalDateTime expected = LocalDateTime.of(2024, 8, 7, 21, 15);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToBrussels() {
        Instant fixedInstant = Instant.parse("2024-08-08T10:15:00Z");
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "Europe/Brussels");
        LocalDateTime expected = LocalDateTime.of(2024, 8, 8, 12, 15);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToBangkok() {
        Instant fixedInstant = Instant.parse("2024-08-08T13:15:00Z");
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "Asia/Bangkok");
        LocalDateTime expected = LocalDateTime.of(2024, 8, 8, 20, 15);
        assertEquals(expected, actual);
    }
}
