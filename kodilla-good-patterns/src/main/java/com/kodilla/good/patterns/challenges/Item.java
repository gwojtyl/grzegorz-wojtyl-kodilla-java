package com.kodilla.good.patterns.challenges;

public class Item {
    private int id;
    private String name;
    private String producer;
    private double price;
    private boolean isAvailable;

    public Item(int id, String name, String producer, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return name +
                ", produced by " + producer +
                ", price = " + price +
                ", availability : " + isAvailable;
    }
}
