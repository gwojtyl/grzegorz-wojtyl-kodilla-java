package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");
        //When
        board.addTask("Clean", toDoList);
        board.addTask("Cook", inProgressList);
        board.addTask("Eat", doneList);
        //Then
        Assert.assertEquals(board.getToDoList(), toDoList);
        Assert.assertEquals(board.getInProgressList(), inProgressList);
        Assert.assertEquals(board.getDoneList(), doneList);
    }
}
