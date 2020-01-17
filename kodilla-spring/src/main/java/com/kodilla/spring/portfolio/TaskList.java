package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class TaskList {
    String name;
    List<String> tasks;

    @Autowired
    public TaskList(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String toString() {
        String result = "";
        for (String task : tasks) {
            result += "\n" + task ;
        }
        return name + ": " + result;
    }

    public List<String> addTask(String taskName) {
        tasks.add(taskName);
        return tasks;
    }
}
