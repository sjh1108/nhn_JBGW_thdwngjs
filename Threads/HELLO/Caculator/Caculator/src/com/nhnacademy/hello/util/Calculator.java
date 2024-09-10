package com.nhnacademy.hello.util;

public final class Calculator {
    private Calculator() {
        throw new IllegalStateException();
    }

    public static int plus(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
