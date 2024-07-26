package org.example;

public class stringexample {

    public void printMessageDetails(String mesaj) {
        System.out.println(mesaj);
        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(10));
        System.out.println(mesaj.concat(" Balkız ile keloğlan"));
        System.out.println(mesaj.substring(0, 9));
        System.out.println(mesaj.substring(9));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));

        char[] yagmur = new char[10];
        mesaj.getChars(0, 8, yagmur, 0);
        System.out.println(yagmur);
        System.out.println(mesaj.indexOf("ç"));
        System.out.println(mesaj.lastIndexOf("o"));
        System.out.println(mesaj.replace(" ", "-"));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toUpperCase());
    }
}
