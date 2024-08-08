package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeZoneConverterTest {

    @Test
    public void testConvertInstantToNewYork() {
        LocalDateTime fixedDateTime = LocalDateTime.parse("2024-08-08T12:15:00");
        Instant fixedInstant = fixedDateTime.atZone(ZoneId.systemDefault()).toInstant();
        LocalDateTime expected = fixedInstant.atZone(ZoneId.of("America/New_York")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "America/New_York");
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToLosAngeles() {
        LocalDateTime fixedDateTime = LocalDateTime.parse("2024-08-08T12:15:00");
        Instant fixedInstant = fixedDateTime.atZone(ZoneId.systemDefault()).toInstant();
        LocalDateTime expected = fixedInstant.atZone(ZoneId.of("America/Los_Angeles")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "America/Los_Angeles");
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToBrussels() {
        LocalDateTime fixedDateTime = LocalDateTime.parse("2024-08-08T12:15:00");
        Instant fixedInstant = fixedDateTime.atZone(ZoneId.systemDefault()).toInstant();
        LocalDateTime expected = fixedInstant.atZone(ZoneId.of("Europe/Brussels")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "Europe/Brussels");
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertInstantToBangkok() {
        LocalDateTime fixedDateTime = LocalDateTime.parse("2024-08-08T12:15:00");
        Instant fixedInstant = fixedDateTime.atZone(ZoneId.systemDefault()).toInstant();
        LocalDateTime expected = fixedInstant.atZone(ZoneId.of("Asia/Bangkok")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(fixedInstant, "Asia/Bangkok");
        assertEquals(expected, actual);
    }
}
