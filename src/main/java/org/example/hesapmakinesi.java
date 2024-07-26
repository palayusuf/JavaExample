package org.example;

public class hesapmakinesi {
    public int toplama(int x, int y)  {
        return x+y;
    }
    public int carpim(int x, int y){
        return x*y;
    }
    public int bolum(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        else {
            return 0;
        }
    }
    public int cikarma(int x, int y) {
        return x-y;
    }
}
