package ru.mpei.l11;

public class Calculator {

    public int sum(int a1, int a2){
        return a1 + a2;
    }

    public int minus(int a1, int a2){
        if (a1 == 10){
            throw new RuntimeException("Magic number add");
        }
        return a1 -a2;
    }

    public int divide(int a1, int a2){
        return a1 / a2;
    }

}
