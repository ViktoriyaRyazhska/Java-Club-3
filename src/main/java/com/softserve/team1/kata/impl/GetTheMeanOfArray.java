package com.softserve.team1.kata.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetTheMeanOfArray extends BaseKata {

    public static int getAverage(ArrayList<String> marks) {
        if(marks.size() == 0) return 0;
        int summa = 0;
        for(int i = 0; i < marks.size(); i++) summa += Integer.parseInt(marks.get(i));

        return (int)Math.floor(summa / marks.size());
    }


    @Override
    public void test() {
        System.out.println("Write students points [1-5]: ");
        Scanner in = new Scanner(System.in);

        String marksString = in.nextLine();

        ArrayList<String> marks = new ArrayList<>(Arrays.asList(marksString.split(" ")));


        System.out.println("Average mark is " + getAverage(marks));
    }
}
