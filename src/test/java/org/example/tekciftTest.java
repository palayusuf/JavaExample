package org.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class tekciftTest{
    @Test
    public void testCiftmitekmi() {
        tekcift tc = new tekcift();

        assertTrue(tc.ciftmitekmi(4), "çift olmalı");

        assertFalse(tc.ciftmitekmi(7), "tek olmamlı");

        assertFalse(tc.ciftmitekmi(-3), "tek olmalı");
    }
}
