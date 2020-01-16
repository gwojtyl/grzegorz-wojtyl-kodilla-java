package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTask(String taskName, TaskList taskListName) {
        taskListName.addTask(taskName);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public String toString() {
        return toDoList.toString() + "\n" + inProgressList + "\n" + doneList;
    }
}
