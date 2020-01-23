package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Paint", 2);
            case PAINTING:
                return new PaintingTask("Painting", "Beige", "Wall");
            case DRIVING:
                return new DrivingTask("Driving", "Shop", "Car");
            default:
                return null;
        }
    }
}
