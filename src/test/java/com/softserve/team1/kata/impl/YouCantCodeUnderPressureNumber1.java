package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class YouCantCodeUnderPressureNumber1 extends BaseKata {

    public static int doubleInteger(int i) {
        return i *= 2;
    }

    @Override
    public void test() {
        Assert.assertEquals( 2, 4, YouCantCodeUnderPressureNumber1.doubleInteger(2));
        Assert.assertEquals( 0, 0, YouCantCodeUnderPressureNumber1.doubleInteger(0));
        Assert.assertEquals( -2, -4, YouCantCodeUnderPressureNumber1.doubleInteger(-2));
    }

    @Test
    public void test_all() {
        Assert.assertEquals( 2, 4, YouCantCodeUnderPressureNumber1.doubleInteger(2));

    }
}
