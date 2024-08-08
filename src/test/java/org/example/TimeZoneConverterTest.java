package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeZoneConverterTest {
    @Test
    public void testConvertInstantToNewyork(){
        Instant instant =Instant.now();
        LocalDateTime expected = instant.atZone(ZoneId.of("America/New_York")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(instant,"America/New_York");
        assertEquals(expected,actual);
    }
    @Test
    public void testConvertLocalDateTimeToLosAngeles(){
        Instant instant =Instant.now();
        LocalDateTime expected = instant.atZone(ZoneId.of("America/Los_Angeles")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(instant,"America/Los_Angeles");
        assertEquals(expected,actual);
    }
    @Test
    public void testConvertLocalDateToBrussels(){
        Instant instant =Instant.now();
        LocalDateTime expected = instant.atZone(ZoneId.of("Europe/Brussels")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(instant,"Europe/Brussels");
        assertEquals(expected,actual);
    }
    @Test
    public void testConvertLocalDateToBangkok(){
        Instant instant =Instant.now();
        LocalDateTime expected = instant.atZone(ZoneId.of("Asia/Bangkok")).toLocalDateTime();
        LocalDateTime actual = new TimeZoneConverter().convertInstantToLocalDateTime(instant,"Asia/Bangkok");
        assertEquals(expected,actual);
    }
}
