package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class IPAddressValidatorTest {

    @Test
    public void testValidIPAddress() {
        IPAddressValidator validator = new IPAddressValidator();
        assertTrue(validator.validate("192.168.1.1")); // Geçerli IP adresi
        assertTrue(validator.validate("255.255.255.255")); // Geçerli IP adresi
    }

    @Test
    public void testInvalidIPAddress() {
        IPAddressValidator validator = new IPAddressValidator();
        assertFalse(validator.validate("256.256.256.256")); // Geçersiz IP adresi
        assertFalse(validator.validate("192.168.1")); // Eksik IP adresi
        assertFalse(validator.validate("abc.def.ghi.jkl")); // Harf içeren IP adresi
        assertFalse(validator.validate("")); // Boş, geçerli değil
    }
}
