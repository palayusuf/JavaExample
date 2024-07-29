package org.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class tekciftTest{
    @Test
    public void testCiftmitekmi() {
        OddEven tc = new OddEven();

        assertTrue(tc.OddOrEven(4), "çift olmalı");

        assertFalse(tc.OddOrEven(7), "tek olmamlı");

        assertFalse(tc.OddOrEven(-3), "tek olmalı");
    }
}
