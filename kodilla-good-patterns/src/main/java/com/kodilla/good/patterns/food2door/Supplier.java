package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public abstract class Supplier {
    private String name;
    private List<Product> products;


    Product apple = new Product("Apple", 0.1, true);


    public Supplier(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProductToStock(Product product) {
        products.add(product);
    }

    public void printInfo() {
        System.out.println(name + " offers:");
        for (Product p : products) {
            if (p.isInStock())
                System.out.println(p.getName() + " for " + p.getPrice());
        }
    }

    public void confirmOrder(Order order) {
        System.out.println("Your order: ");
        order.toString();
    }

    abstract public void process();
}
