package org.example;

public class Main {
    public static void main(String[] args) {
        OddEven EvenControl = new OddEven();
        int sayi = 10;
        boolean ciftmi = EvenControl.OddOrEven(sayi);
        System.out.println(ciftmi);

        Calculator hm = new Calculator();
        int sonuc = hm.division(25, 5);
        System.out.println("Division: " + sonuc);
        sonuc = hm.multiplication(25, 5);
        System.out.println("Multiplication: " + sonuc);
        sonuc = hm.addition(25, 5);
        System.out.println("Addition: " + sonuc);
        sonuc = hm.subtraction(25, 5);
        System.out.println("Scd /path/to/your/project\nubtraction: " + sonuc);

        stringexample str = new stringexample();
        String message = "Hi, today is a very nice day.";
        str.printMessageDetails(message);
    }
}
