package com.softserve.team1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1.Multiply");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        switch (i){
            case 1:
                Task2 task2 = new Task2();
                System.out.println(task2.multiply(1,2));
                break;
            default:
                System.out.println("lol");

        }

    }
}
