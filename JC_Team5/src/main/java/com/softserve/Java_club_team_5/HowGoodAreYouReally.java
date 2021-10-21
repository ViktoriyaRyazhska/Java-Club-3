package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class HowGoodAreYouReally {

    private final int[] studentsMarks = new int[10];
    private int mark;
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        HowGoodAreYouReally howGoodAreYouReally = new HowGoodAreYouReally();
        System.out.println(howGoodAreYouReally.checkIsYouBetter(howGoodAreYouReally.calculateAverage()));
    }

    public boolean checkIsYouBetter(int averageMark) {
        System.out.println("Your mark: ");
        int mark = in.nextInt();
        return mark >= averageMark;
    }

    public int calculateAverage() {
        int sum = 0;
        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println(i + " number: ");
            studentsMarks[i] = in.nextInt();
            sum = sum + studentsMarks[i];
        }
        return sum / 10;
    }
}
