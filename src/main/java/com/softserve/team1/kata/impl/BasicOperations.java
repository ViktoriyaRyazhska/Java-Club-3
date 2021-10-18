package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class BasicOperations extends BaseKata{

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
        }
        return 0;
    }


    @Override
    public void test() {
        System.out.println("Enter value one:");
        int val1 = (int) readInput(InputType.INT);
        System.out.println("Enter value two:");
        int val2 = (int) readInput(InputType.INT);
        System.out.println("Enter value operation:");
        String operation = (String) readInput(InputType.STRING);
        System.out.println("Operation result = " + basicMath(operation,val1,val2));
    }
}
