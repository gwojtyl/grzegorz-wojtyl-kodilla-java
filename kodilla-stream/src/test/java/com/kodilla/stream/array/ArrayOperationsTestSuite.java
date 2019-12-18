package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];

        //When
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers[i] = random.nextInt(50);
        }

        //Then
        double expectedAverage = 0;
        for (int number : numbers) {
            expectedAverage += number;
        }
        expectedAverage /= 20;
        Assert.assertEquals(expectedAverage, ArrayOperations.getAverage(numbers), 0);
    }
}
