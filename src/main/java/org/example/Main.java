package org.example;

public class Main {
    public static void main(String[] args) {
        OddEven EvenControl = new OddEven();
        int number = 10;
        boolean ciftmi = EvenControl.OddOrEven(number);
        System.out.println(ciftmi);

        Calculator hm = new Calculator();
        int result = hm.division(25, 5);
        System.out.println("Division: " + result);
        result = hm.multiplication(25, 5);
        System.out.println("Multiplication: " + result);
        result = hm.addition(25, 5);
        System.out.println("Addition: " + result);
        result = hm.subtraction(25, 5);
        System.out.println("Scd /path/to/your/project\nubtraction: " + result);

        stringexample str = new stringexample();
        String message = "Hi, today is a very nice day.";
        str.printMessageDetails(message);
    }
}
