package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addTask("Clean", board.getToDoList());
        board.addTask("Cook", board.getDoneList());
        board.addTask("Eat", board.getInProgressList());
        System.out.println(board.toString());
    }
}
