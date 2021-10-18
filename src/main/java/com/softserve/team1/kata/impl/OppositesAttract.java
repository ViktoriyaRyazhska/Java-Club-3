package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class OppositesAttract extends BaseKata{
    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    @Override
    public void test() {

    }


}
