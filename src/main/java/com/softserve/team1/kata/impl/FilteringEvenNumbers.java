package com.softserve.team1.kata.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilteringEvenNumbers extends BaseKata{
    private List<Integer> list;
    private Scanner scanner;
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        listOfNumbers.removeIf(i -> i%2 == 0);

        return listOfNumbers;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        System.out.println("Method is supposed to remove even numbers from the list and return a list that contains the odd numbers.");
        System.out.println("Provide some integers");

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (scanner.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(scanner.nextInt());
            } else {
                break;
            }
        } while (true);


        System.out.println("Result: " + filterOddNumber(list));
    }
}
