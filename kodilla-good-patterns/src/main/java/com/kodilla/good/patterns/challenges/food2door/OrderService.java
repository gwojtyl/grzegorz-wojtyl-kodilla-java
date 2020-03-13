package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto process(Supplier supplier) {
        boolean orderExists = supplier.process();

        if (orderExists) {
            orderRepository.createOrder(supplier.getClass().getSimpleName(), supplier.getProduct(), supplier.getQuantity());
            return new OrderDto(supplier.getProduct(), supplier.getQuantity(), true);
        } else {
            return new OrderDto(supplier.getProduct(), supplier.getQuantity(), false);
        }
    }
}
