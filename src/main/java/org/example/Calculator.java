package org.example;

public class Calculator {
    public int addition(int x, int y)  {
        return x+y;
    }
    public int multiplication(int x, int y){
        return x*y;
    }
    public int division(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        else {
            return 0;
        }
    }
    public int subtraction(int x, int y) {
        return x-y;
    }
}
