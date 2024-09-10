package com.nhnacademy.app;

import org.apache.commons.math3.random.RandomDataGenerator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Random number: " + new Random().nextInt(100));
        System.out.println("Random number: " + new RandomDataGenerator().nextInt(0, 100));
    }
}
