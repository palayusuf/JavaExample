package org.example;

public class Main {
    public static void main(String[] args) {
        OddEven EvenControl = new OddEven();
        int number = 10;
        boolean ciftmi = EvenControl.OddOrEven(number);
        System.out.println(ciftmi);

        Calculator hm = new Calculator();
        int result = hm.divide(25, 5);
        System.out.println("Division: " + result);
        result = hm.multiply(25, 5);
        System.out.println("Multiplication: " + result);
        result = hm.add(25, 5);
        System.out.println("Sum: " + result);
        result = hm.subtract(25, 5);
        System.out.println("Subtraction: " + result);

        stringexample str = new stringexample();
        String message = "Hi, today is a very nice day.";
        str.printMessageDetails(message);

        ByteValidator validator = new ByteValidator("ISO-8859-9");
        byte[] byteArray = { (byte) 0xE7 };
        boolean isValid = validator.isValidByteArray(byteArray);

        System.out.println("Is valid: " + isValid);
    }
    }