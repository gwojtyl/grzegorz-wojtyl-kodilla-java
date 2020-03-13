package com.kodilla.good.patterns.challenges.food2door;

public class OrderRepository {
    public boolean createOrder(String supplier, String product, double quantity) {
        System.out.println("Supplier " + supplier + "\nOrder: \n" + product + " x " + quantity + "\n");
        return true;
    }
}
