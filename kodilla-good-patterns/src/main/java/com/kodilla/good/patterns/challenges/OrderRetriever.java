package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    public Order retrieve() {
        User user = new User(1,"Jacek", "jacek@mail.com");
        LocalDate date = LocalDate.of(2014, 2, 22);
        Item item1 = new Item(1, "Fridge", "Bosch", 1099.99, true);
        Item item2 = new Item(2, "Champagne", "Moet Chandon", 199.99, false);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        return new Order(1, user, date, items);
    }
}
