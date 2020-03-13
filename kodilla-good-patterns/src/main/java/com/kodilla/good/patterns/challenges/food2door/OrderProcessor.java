package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    public Supplier process(String product, double quantity) {
        if (product.toLowerCase().contains("extra")) {
            return new ExtraFoodShop(product, quantity);
        } else if (product.toLowerCase().contains("healthy")) {
            return new HealthyShop(product, quantity);
        } else if (product.toLowerCase().contains("gluten free")) {
            return new GlutenFreeShop(product, quantity);
        } else {
            System.out.println("None of the supplier provides this product");
            return new ExtraFoodShop("", 0);
        }
    }
}
