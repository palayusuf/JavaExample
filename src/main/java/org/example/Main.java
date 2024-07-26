package org.example;

public class Main {
    public static void main(String[] args) {
        tekcift ciftkontrol = new tekcift();
        int sayi = 10;
        boolean ciftmi = ciftkontrol.ciftmitekmi(sayi);
        System.out.println(ciftmi);

        hesapmakinesi hm = new hesapmakinesi();
        int sonuc = hm.bolum(25, 5);
        System.out.println("Bölüm: " + sonuc);
        sonuc = hm.carpim(25, 5);
        System.out.println("Çarpım: " + sonuc);
        sonuc = hm.toplama(25, 5);
        System.out.println("Toplama: " + sonuc);
        sonuc = hm.cikarma(25, 5);
        System.out.println("Çıkarma: " + sonuc);

        stringexample str = new stringexample();
        String mesaj = "selam bugün hava çok güzel.";
        str.printMessageDetails(mesaj);
    }
}
