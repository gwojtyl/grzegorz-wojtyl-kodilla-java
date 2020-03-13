package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        Supplier extraFoodShop = orderProcessor.process("Extra Marchew", 20);
        Supplier healthyShop = orderProcessor.process("Healthy Mleko", 1.5);
        Supplier glutenFreeShop = orderProcessor.process("Gluten Free Chleb", 2);

        OrderService orderService = new OrderService(new OrderRepository());
        orderService.process(extraFoodShop);
        orderService.process(healthyShop);
        orderService.process(glutenFreeShop);
    }
}
