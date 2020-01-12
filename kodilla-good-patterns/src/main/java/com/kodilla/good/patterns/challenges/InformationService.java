package com.kodilla.good.patterns.challenges;

public interface InformationService {
    void informIfInStock(User user, Order order);
    void informIfNotInStock(User user, Order order);
}
