package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notify(StudentTasks studentTasks) {
        System.out.println("Hello " + name + ", your student " + studentTasks.getStudent().getName() +
                " has just solved new task " + studentTasks.getTasks().peekLast() + "\n" +
                "He solved " + studentTasks.getTasks().size() + " tasks already");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
