package com.softserve.team1.kata.impl;

import org.testng.Assert;

public class DoIGetABonus extends BaseKata{

    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            return "\u00A3" + salary * 10;
        } else {
            return "\u00A3" + salary;
        }
    }

    @Override
    public void test() {
        boolean wellConfigured = true;// have to find another way!!!!!
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"100000",DoIGetABonus.bonusTime(10000, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"250000",DoIGetABonus.bonusTime(25000, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"10000",DoIGetABonus.bonusTime(10000, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"60000",DoIGetABonus.bonusTime(60000, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"20",DoIGetABonus.bonusTime(2, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"78",DoIGetABonus.bonusTime(78, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"678900",DoIGetABonus.bonusTime(67890, true));

    }
}
