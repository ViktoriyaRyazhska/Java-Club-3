package com.softserve.team1;

public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] newArr = new String[3];
        newArr[0] = arr[2];
        newArr[1] = arr[1];
        newArr[2] = arr[0];
        return newArr;
    }
}
