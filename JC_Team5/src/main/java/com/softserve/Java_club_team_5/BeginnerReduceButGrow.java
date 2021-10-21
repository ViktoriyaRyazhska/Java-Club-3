package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class BeginnerReduceButGrow {

    public static int calculateGrow(int value){
        int[] arr = new int[value];
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            result = result * arr[i];
        }
        return result;
    }
}
