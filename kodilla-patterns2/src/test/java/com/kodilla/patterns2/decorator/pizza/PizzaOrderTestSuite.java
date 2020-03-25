package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        BigDecimal calculatedCost = pizzaOrder.getCost();

        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        String description = pizzaOrder.getDescription();

        assertEquals("Basic pizza, tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithHamAndOlivesGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OliveDecorator(pizzaOrder);

        BigDecimal cost = pizzaOrder.getCost();

        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OliveDecorator(pizzaOrder);

        String description = pizzaOrder.getDescription();

        assertEquals("Basic pizza, tomato sauce and cheese + ham + olives", description);
    }

    @Test
    public void testPizzaWithAllIngredientsAndExtraCheeseGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new OliveDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);

        BigDecimal cost = pizzaOrder.getCost();

        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testPizzaWithAllIngredientsAndExtraCheeseGetDescription() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new OliveDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);

        String description = pizzaOrder.getDescription();

        assertEquals("Basic pizza, tomato sauce and cheese + extra cheese + ham + mushrooms + olives + onions", description);
    }
}
