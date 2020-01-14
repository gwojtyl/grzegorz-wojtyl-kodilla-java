package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(8, 4);
        double diff = calculator.sub(8, 4);
        double product = calculator.mul(8, 4);
        double quotient = calculator.div(8, 4);
        //Then
        Assert.assertEquals(12, sum, 0);
        Assert.assertEquals(4, diff, 0);
        Assert.assertEquals(32, product, 0);
        Assert.assertEquals(2, quotient, 0);
    }
}
