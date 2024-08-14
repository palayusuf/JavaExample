package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IPAddressValidatorTest {

    IPAddressValidator validator = new IPAddressValidator();

    @Test
    public void testValidIPAddresses() {
        assertTrue(validator.isValidIPAddress("192.168.1.1"));
        assertTrue(validator.isValidIPAddress("0.0.0.0"));
        assertTrue(validator.isValidIPAddress("255.255.255.255"));
        assertTrue(validator.isValidIPAddress("127.0.0.1"));
    }

    @Test
    public void testInvalidIPAddresses() {
        assertFalse(validator.isValidIPAddress("256.256.256.256"));
        assertFalse(validator.isValidIPAddress("192.168.1"));
        assertFalse(validator.isValidIPAddress("192.168.1.1.1"));
        assertFalse(validator.isValidIPAddress("192.168.1.abc"));
    }

    @Test
    public void testIPAddressesContainingLetters() {
        assertFalse(validator.isValidIPAddress("192.168.a.1"));
    }

    @Test
    public void testIPAddressesStartingWith0000() {
        assertFalse(validator.isValidIPAddress("0000.168.1.1"));
    }

    @Test
    public void testIPAddressesOutOfRange() {
        assertFalse(validator.isValidIPAddress("999.999.999.999"));
        assertFalse(validator.isValidIPAddress("300.168.1.1"));
        assertFalse(validator.isValidIPAddress("192.300.1.1"));
        assertFalse(validator.isValidIPAddress("192.168.300.1"));
        assertFalse(validator.isValidIPAddress("192.168.1.300"));
    }
}
