package com.club3.java.impl;

import java.util.Scanner;

public class LoopsImpl {

    public int[] map35(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public int grow39(int[] x) {
        int mult = 1;
        for (int i = 0; i < x.length; i++) {
            mult *= x[i];
        }
        return mult;

    }

    public int findNearestSquare43(int num) {
        return (int) Math.pow(Math.round(Math.sqrt(num)), 2);

    }

    public int getTheMeanOfAnArray(int size, Scanner scanner) {
        int[] marks = new int[size];
        int averageMark = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element: " + i);
            marks[i] = scanner.nextInt();
            sum += marks[i];
            averageMark = sum / size;
        }
        return averageMark;
    }

    public String howGoodAreYouReally(int yourMark, int arraySize, Scanner scanner) {
        int[] classPoints = new int[arraySize];
        int averageClassPoint = 0;
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element: " + i);
            classPoints[i] = scanner.nextInt();
            sum += classPoints[i];
            averageClassPoint = sum / arraySize;
        }
        if (averageClassPoint < yourMark) {
            return "True";
        } else {
            return "False";
        }
    }

    public int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs((sonYears * 2) - dadYears);
    }

    public String twentyOneStick(Scanner scanner) {
        int firstPlayer;
        int secondPlayer;
        int sticks = 21;
        do {
            System.out.println("First Player move:");
            firstPlayer = scanner.nextInt();

            if (firstPlayer < 0 || firstPlayer > 3) {
                System.out.println("Invalid input");
            } else {
                sticks -= firstPlayer;
            }

            System.out.println("There are only " + sticks + " sticks!");

            System.out.println("Second Player move: ");
            secondPlayer = scanner.nextInt();

            if (secondPlayer < 0 || secondPlayer > 3) {
                System.out.println("Invalid input");
            } else {
                sticks -= secondPlayer;
            }

            System.out.println("There are only " + sticks + " sticks!");

            if (sticks == 0) {
                System.out.println("Game End");
            }
        } while (sticks != 0);

        if (firstPlayer > 0) {
            return "Second Player win";
        } else {
            return "First Player win";
        }
    }
}
