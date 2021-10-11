package com.softserve.team3;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
