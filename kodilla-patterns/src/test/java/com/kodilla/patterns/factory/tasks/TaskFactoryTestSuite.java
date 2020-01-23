package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.createTask(TaskFactory.SHOPPING);

        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        TaskFactory factory = new TaskFactory();

        Task painting = factory.createTask(TaskFactory.PAINTING);

        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        TaskFactory factory = new TaskFactory();

        Task driving = factory.createTask(TaskFactory.DRIVING);

        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
