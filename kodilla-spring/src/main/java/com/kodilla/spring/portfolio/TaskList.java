package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    final String name;
    List<String> tasks;

    public TaskList(final String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(name);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String result = "";
        for (String task : tasks) {
            result += task;
        }
        return result;
    }
}
