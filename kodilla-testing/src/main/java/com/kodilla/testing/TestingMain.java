package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 8);
        if (sum == 18){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int diff = calculator.subtract(10, 8);
        if (diff == 2){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
