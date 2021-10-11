package com.softserve.team1;

import com.softserve.team1.kata.impl.BaseKata;

import java.util.Map;
import java.util.Scanner;

import static com.softserve.team1.kata.KataUtils.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Class<? extends BaseKata>> kataMap = getKataMap();

        printKataNames(kataMap);

        System.out.println();
        System.out.println("Hello. This application can run kata. Just type in kata name and enjoy. " +
                "(To exit application type in 'exit')");
        System.out.println();

        while(true) {
            System.out.println("Please type in kata name. (Case sensitive)");
            String input = scanner.next();

            if(input.equals("exit")) {
                break;
            }

            runKataByName(kataMap, input);
        }
    }
}
