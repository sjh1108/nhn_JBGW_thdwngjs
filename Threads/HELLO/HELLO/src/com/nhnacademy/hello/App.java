package com.nhnacademy.hello;
import com.nhnacademy.hello.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 100;
        int b = 10;

        System.out.println("a + b = " + Calculator.plus(a, b));
        System.out.println("a - b = " + Calculator.subtract(a, b));
        System.out.println("a * b = " + Calculator.multiply(a, b));
        System.out.println("a / b = " + Calculator.divide(a, b));
    }
}
