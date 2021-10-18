package com.softserve.team1.kata.impl;

import org.testng.Assert;

public class ReturnNegative extends BaseKata{
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }

    @Override
    public void test() {
        Assert.assertEquals(42, -42, ReturnNegative.makeNegative(42));
    }
}
