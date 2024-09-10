package com.nhnacademy.random;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class RandomTest {

    @org.junit.jupiter.api.Test
    void utilRandomGenerator() {
    }

    @Test
    @DisplayName("random generator 1<=num<=100")
    public void randomGenerator() {
        int actual = new RandomDataGenerator().nextInt(1,101);

        Assertions.assertTrue(actual <= 100 && actual >= 1);
    }
}