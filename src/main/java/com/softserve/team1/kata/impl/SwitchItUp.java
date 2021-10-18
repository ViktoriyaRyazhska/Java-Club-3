package com.softserve.team1.kata.impl;

import org.testng.Assert;

public class SwitchItUp extends BaseKata{

    public static String switchItUp(int number)
    {
        switch(number){
            case 0 : return "Zero";
            case 1 : return "One";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            default: return "";
        }
    }

    @Override
    public void test() {
        Assert.assertEquals("One", SwitchItUp.switchItUp(1));
        Assert.assertEquals("Three", SwitchItUp.switchItUp(3));
        Assert.assertEquals("Five", SwitchItUp.switchItUp(5));
    }
}
