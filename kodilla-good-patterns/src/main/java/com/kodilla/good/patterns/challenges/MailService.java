package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void informIfInStock(User user, Order order) {
        System.out.println("User " + user.getName() + " placed the order.");
        System.out.println("Order contains " + order.getItems().toString());
        System.out.println("Sending confirmation email to " + user.getEmail());
    }

    @Override
    public void informIfNotInStock(User user, Order order) {
        System.out.println("At least one of the items is not in stock.");
        System.out.println(order.getItems().toString());
    }
}
