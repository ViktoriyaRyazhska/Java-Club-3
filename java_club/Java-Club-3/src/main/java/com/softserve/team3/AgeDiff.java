package com.softserve.team3;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if((yearTo - birth)==1){

        } if ((yearTo - birth) > 0) {
            if (Math.abs(yearTo - birth) == 1) {
                return "You are " + Math.abs(yearTo - birth) + " year old.";
            } else {
                return "You are " + Math.abs(yearTo - birth) + " years old.";
            }
        }
        if ((yearTo - birth) == 0) {
            return "You were born this very year!";
        }
        if ((yearTo - birth) < 0) {
            if (Math.abs(yearTo - birth)  == 1 ) {
                return "You will be born in " + Math.abs(yearTo - birth) + " year.";
            } else {
                return "You will be born in " + Math.abs(yearTo - birth) + " years.";
            }
        }
        return "";
    }
}
