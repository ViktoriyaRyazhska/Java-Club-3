package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MyHeadIsAtTheWrongEnd extends BaseKata{

    public static String[] fixTheMeerkat(String[] arr) {
        String[] newArr = new String[3];
        newArr[0] = arr[2];
        newArr[1] = arr[1];
        newArr[2] = arr[0];
        return newArr;
    }

    ///  here tests from code wars
    @Override
    public void test() {

    }
}
