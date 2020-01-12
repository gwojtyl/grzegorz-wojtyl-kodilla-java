package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        if (order.getItems().stream().allMatch(Item::isAvailable)) {
            informationService.informIfInStock(order.getUser(), order);
            orderRepository.createOrder(order.getUser(), order.getDate(), order.getItems());
        } else {
            order.getItems().removeIf(Item::isAvailable);
            informationService.informIfNotInStock(order.getUser(), order);
        }
        return new OrderDto(order.getUser(), order.getItems());
    }
}
