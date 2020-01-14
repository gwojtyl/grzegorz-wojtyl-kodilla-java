package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList toDoList = new TaskList("To do list");
        TaskList inProgressList = new TaskList("In progress list");
        TaskList doneList = new TaskList("Done list");
        board.addTask("Clean the mess", toDoList);
        board.addTask("Vacuum", inProgressList);
        board.addTask("Code", doneList);
        //Then
        System.out.println(board.printTaskList(toDoList));
        System.out.println(board.printTaskList(inProgressList));
        System.out.println(board.printTaskList(doneList));
    }
}
