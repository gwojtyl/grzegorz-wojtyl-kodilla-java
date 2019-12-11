package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evens = new ArrayList<Integer>();

        if (!numbers.isEmpty()) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evens.add(number);
                }
            }
        } else {
            return null;
        }

        return evens;
    }
}
