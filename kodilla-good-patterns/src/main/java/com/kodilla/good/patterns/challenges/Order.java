package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private User user;
    private LocalDate date;
    private List<Item> items;

    public Order(int id, User user, LocalDate date, List<Item> items) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Item> getItems() {
        return items;
    }
}
