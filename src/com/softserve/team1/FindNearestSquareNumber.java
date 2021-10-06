package com.softserve.team1;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }
}
