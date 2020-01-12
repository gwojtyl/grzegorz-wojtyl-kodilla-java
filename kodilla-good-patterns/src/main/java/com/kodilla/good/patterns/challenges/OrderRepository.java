package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository {
    void createOrder(User user, LocalDate date, List<Item> items);
}
