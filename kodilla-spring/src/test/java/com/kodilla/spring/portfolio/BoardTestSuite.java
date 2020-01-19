package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList toDoList = (TaskList)context.getBean("toDoList");
        TaskList inProgressList = (TaskList)context.getBean("inProgressList");
        TaskList doneList = (TaskList)context.getBean("doneList");

        toDoList.addTask("Clean");
        inProgressList.addTask("Sleep");
        doneList.addTask("Cook");

        Assert.assertEquals(board.getToDoList().toString(), context.getBean("toDoList").toString());
        Assert.assertEquals(board.getInProgressList().toString(), context.getBean("inProgressList").toString());
        Assert.assertEquals(board.getDoneList().toString(), context.getBean("doneList").toString());
    }
}
