package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop extends Supplier{
    private List<Product> products;

    public ExtraFoodShop(String name) {
        super(name);
        products = new ArrayList<>();
        products.add(new Product("Carrot", 0.37, false));
        products.add(new Product("Pepper", 1.72, true));
        products.add(new Product("Tomato", 1.45, true));
        products.add(new Product("Cucumber", 0.78, true));
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
            order.addToOrder(getProducts().get(0), 2);
            order.addToOrder(getProducts().get(3), 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Some of the products you ordered are out of stock.");
        } finally {
            confirmOrder(order);
        }
    }
}
