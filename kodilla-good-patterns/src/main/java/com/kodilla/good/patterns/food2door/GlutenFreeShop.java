package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop extends Supplier {
    private List<Product> products;

    public GlutenFreeShop(String name) {
        super(name);
        products = new ArrayList<>();
        products.add(new Product("Bread", 1.11, true));
        products.add(new Product("Bagel", 0.5, true));
        products.add(new Product("Bread roll", 0.4, false));
        products.add(new Product("Flour", 0.99, true));
    }

    @Override
    public void process() {
        for (Product product : products) {
            if (product.isInStock())
                addProductToStock(product);
        }
        this.printInfo();

        Order order = new Order();
        try {
            order.addToOrder(getProducts().get(1), 2);
            order.addToOrder(getProducts().get(3), 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Some of the products you ordered are out of stock.");
        } finally {
            confirmOrder(order);
        }
    }
}
