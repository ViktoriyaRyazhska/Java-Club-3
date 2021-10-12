package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class RockPaperScissors extends BaseKata {
    private Scanner scanner;
    private String str1,str2;
    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("Method returns which player won in rock paper scissors");
        System.out.println("Provide first players' choice");
        if(scanner.hasNextLine()){
            str1 = scanner.nextLine();
        }
        System.out.println("Provide second players' choice");
        if(scanner.hasNextLine()){
            str2 = scanner.nextLine();
        }
        System.out.println(rps(str1,str2));
    }
}
