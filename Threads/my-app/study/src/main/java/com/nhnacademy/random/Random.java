package com.nhnacademy.random;

import org.apache.commons.math3.random.RandomDataGenerator;
/**
 * Hello world!
 *
 */
public class Random
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(new java.util.Random().nextInt(100));
        System.out.println(new RandomDataGenerator().nextInt(1, 100));

    }
}
