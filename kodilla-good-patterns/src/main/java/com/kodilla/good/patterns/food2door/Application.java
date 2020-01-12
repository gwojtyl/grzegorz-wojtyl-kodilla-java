package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        Supplier extraFoodShop = new ExtraFoodShop("Extra Food Shop");
        extraFoodShop.process();

        Supplier healthyShop = new HealthyShop("Healthy Shop");
        healthyShop.process();

        Supplier glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");
        glutenFreeShop.process();
    }
}
