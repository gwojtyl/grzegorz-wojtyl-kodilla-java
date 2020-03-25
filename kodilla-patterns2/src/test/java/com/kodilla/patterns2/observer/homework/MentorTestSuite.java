package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testNotify() {
        StudentTasks johnSmithTasks = new StudentTasks(new Student("John Smith"));
        StudentTasks ivoneEscobarTasks = new StudentTasks(new Student("Ivone Escobar"));
        StudentTasks jessiePinkmanTasks = new StudentTasks(new Student("Jessie Pinkman"));
        Mentor melGibson = new Mentor("Mel Gibson");
        Mentor carlChudyk = new Mentor("Carl Chudyk");
        johnSmithTasks.registerObserver(melGibson);
        ivoneEscobarTasks.registerObserver(melGibson);
        jessiePinkmanTasks.registerObserver(carlChudyk);

        johnSmithTasks.addTask("Task 3.4");
        johnSmithTasks.addTask("Task 11.2");
        ivoneEscobarTasks.addTask("Task 2.5");
        jessiePinkmanTasks.addTask("Task 4.4");
        jessiePinkmanTasks.addTask("Task 8.8");
        jessiePinkmanTasks.addTask("Task 7.1");

        assertEquals(3, melGibson.getUpdateCount());
        assertEquals(3, carlChudyk.getUpdateCount());
        assertEquals(2, johnSmithTasks.getTasks().size());
        assertEquals(1, ivoneEscobarTasks.getTasks().size());
        assertEquals(3, jessiePinkmanTasks.getTasks().size());
    }
}
