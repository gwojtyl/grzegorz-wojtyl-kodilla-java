package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private String product;
    private double quantity;
    private boolean orderExists;

    public OrderDto(final String product, double quantity, final boolean orderExists) {
        this.product = product;
        this.quantity = quantity;
        this.orderExists = orderExists;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isOrderExists() {
        return orderExists;
    }
}
