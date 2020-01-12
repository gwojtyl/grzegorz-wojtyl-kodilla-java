package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductOrderRepository implements OrderRepository {
    private Map<User, List<Item>> orders = new HashMap<>();

    public Map<User, List<Item>> getOrders() {
        return orders;
    }

    @Override
    public void createOrder(User user, LocalDate date, List<Item> items) {
        orders.put(user, items);
    }
}
