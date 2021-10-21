package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class WillBeThereEnoughSpace {

    public static void main(String[] args) {
        WillBeThereEnoughSpace willBeThereEnoughSpace = new WillBeThereEnoughSpace();
        Scanner in = new Scanner(System.in);
        System.out.println( willBeThereEnoughSpace.checkFreePlaces(in.nextInt(),in.nextInt(),in.nextInt()));

    }

    public String checkFreePlaces(int cap, int on, int wait) {

        int income = on + wait;
        if (income > cap) {
            return "He cant fit all " + (income - cap) + " of the " + wait + " waiting.";
        }else
            return "He can fit all " + wait + " passengers.";
    }
}
