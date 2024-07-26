package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class hesapmakinesiTest {
    @Test
    public void testToplama() {
        hesapmakinesi hm = new hesapmakinesi();
        assertEquals(7, hm.toplama(3, 4), "Toplama işlemi doğru değil");
        assertEquals(-1, hm.toplama(-3, 2), "Toplama işlemi doğru değil");
    }

    @Test
    public void testCarpim() {
        hesapmakinesi hm = new hesapmakinesi();
        assertEquals(12, hm.carpim(3, 4), "Çarpma işlemi doğru değil");
        assertEquals(-6, hm.carpim(-3, 2), "Çarpma işlemi doğru değil");
    }

    @Test
    public void testBolum() {
        hesapmakinesi hm = new hesapmakinesi();
        assertEquals(2, hm.bolum(10, 5), "Bölme işlemi doğru değil");
        assertEquals(-3, hm.bolum(-9, 3), "Bölme işlemi doğru değil");

        assertEquals(0, hm.bolum(10, 0), "Bölme sıfır ile bölünememeli");
    }

    @Test
    public void testCikarma() {
        hesapmakinesi hm = new hesapmakinesi();
        assertEquals(-1, hm.cikarma(3, 4), "Çıkarma işlemi doğru değil");
        assertEquals(-5, hm.cikarma(-3, 2), "Çıkarma işlemi doğru değil");
    }
}

