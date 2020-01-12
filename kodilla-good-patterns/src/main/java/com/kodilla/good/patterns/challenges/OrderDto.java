package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderDto {
    private User user;
    private List<Item> order;

    public OrderDto(final User user,  final List<Item> order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public List<Item> getOrder() {
        return order;
    }
}
