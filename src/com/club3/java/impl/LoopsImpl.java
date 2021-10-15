package com.club3.java.impl;

import java.util.Scanner;

public class LoopsImpl {

    public int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs((sonYears * 2) - dadYears);
    }

    public String twentyOneStick() {
        Scanner scanner = new Scanner(System.in);
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
