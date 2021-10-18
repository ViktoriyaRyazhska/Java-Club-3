package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ParceNiceIntFromCharProblem extends BaseKata {
    public static int howOld(final String herOld) {
        return herOld.charAt(0) - '0';
    }

    @Override
    public void test() {
        Assert.assertEquals(5, ParceNiceIntFromCharProblem.howOld("5 years old"));
        Assert.assertEquals(9, ParceNiceIntFromCharProblem.howOld("9 years old"));
        Assert.assertEquals(1, ParceNiceIntFromCharProblem.howOld("1 year old"));
    }


}
