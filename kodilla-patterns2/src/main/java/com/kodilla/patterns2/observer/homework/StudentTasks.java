package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTasks implements Observable {
    private final Student student;
    private final Deque<String> tasks;
    private final List<Observer> observers;

    public StudentTasks(Student student) {
        this.student = student;
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.notify(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getTasks() {
        return tasks;
    }
}
