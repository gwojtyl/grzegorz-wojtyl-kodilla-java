package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Supplier{
    private List<Product> products;

    public HealthyShop(String name) {
        super(name);
        products = new ArrayList<>();
        products.add(new Product("Apple", 0.37, false));
        products.add(new Product("Pear", 1.72, false));
        products.add(new Product("Cherry", 1.45, false));
        products.add(new Product("Plum", 0.78, true));
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
            order.addToOrder(getProducts().get(3), 2);
            order.addToOrder(getProducts().get(0), 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Some of the products you ordered are out of stock.");
        } finally {
            confirmOrder(order);
        }
    }
}
