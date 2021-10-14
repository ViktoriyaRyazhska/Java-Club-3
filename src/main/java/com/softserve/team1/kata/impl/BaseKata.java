package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;
import com.softserve.team1.kata.Kata;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public abstract class BaseKata implements Kata {

    protected Scanner scanner;

    public BaseKata() {
        this.scanner = new Scanner(System.in);
    }

    public Object readInput(InputType inputType) {
        Object result = null;

        while (Objects.isNull(result)) {
            System.out.printf("Required input type is : %s \n", inputType);

            try {
                if (InputType.STRING.equals(inputType)) {
                    String string = scanner.next();

                    if (string.isEmpty()) {
                        throw new InputMismatchException();
                    }

                    result = string;
                } else if (InputType.INT.equals(inputType)) {
                    result = scanner.nextInt();
                } else if (InputType.DOUBLE.equals(inputType)) {
                    result = scanner.nextDouble();
                } else if (InputType.BOOLEAN.equals(inputType)) {
                    result = scanner.nextBoolean();
                } else {
                    System.out.printf("Unknown input type: %s \n", inputType);
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input data format! Please fix and try again.");
                scanner.nextLine();
            }
        }

        return result;
    }

}
