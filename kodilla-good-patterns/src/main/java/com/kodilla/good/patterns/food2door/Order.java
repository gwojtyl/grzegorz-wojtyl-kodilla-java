package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> order;

    public Order() {
        order = new HashMap<>();
    }

    public Map<Product, Integer> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        for (Map.Entry entry : order.entrySet()) {
            System.out.println(entry.getKey().toString() + " x " + entry.getValue());
        }
        return "";
    }

    public void addToOrder(Product product, Integer quantity) {
        order.put(product, quantity);
    }
}
