package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board() {
        toDoList = new TaskList("To do list");
        inProgressList = new TaskList("In progress list");
        doneList = new TaskList("Done list");
    }

    public String printTaskList(TaskList taskList) {
        return "Tasks: " + taskList.getTasks();
    }

    public void addTask(String task, TaskList taskList) {
        taskList.getTasks().add(task);
    }
}
