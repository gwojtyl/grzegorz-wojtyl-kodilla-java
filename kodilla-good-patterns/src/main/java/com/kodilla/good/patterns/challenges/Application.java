package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ProductOrderRepository());
        productOrderService.process(order);
    }
}
