package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("salad")
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("bacon")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();

        Assert.assertEquals(3, howManyIngredients);
    }
}
