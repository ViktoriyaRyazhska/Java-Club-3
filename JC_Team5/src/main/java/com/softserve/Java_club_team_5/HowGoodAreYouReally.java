package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class HowGoodAreYouReally {

    private final int[] studentsMarks = new int[10];
    private int mark;
    Scanner in=new Scanner(System.in);


    public boolean checkIsYouBetter(int mark) {
        this.mark = mark;
        return mark >= calculateAverage();
    }

    public int calculateAverage() {
        System.out.println("Enter marks to calculate avarage");
        int sum = 0;
        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println(i + " number: ");
            studentsMarks[i] = in.nextInt();
            sum = sum + studentsMarks[i];
        }
        return sum / studentsMarks.length;
    }
}
