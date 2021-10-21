package com.softserve.Java_club_team_5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BasicProgrammingTest extends TestCase {
    static BasicProgramming bp=new BasicProgramming();
    public void testDoubleInteger() {
        Assert.assertEquals(bp.doubleInteger(3),6);
    }
    @Test
    public void testMultiply() {
        Assert.assertEquals(bp.multiply(3,5),15);
        Assert.assertEquals(bp.multiply(3,0),0);
    }

    public void testGetVolumeOfCuboid() {
       Assert.assertEquals((int) bp.getVolumeOfCuboid(3.0,3.0,3.0),27);
    }

    public void testIsDivisible() {
        Assert.assertTrue(bp.isDivisible(12,3));
        Assert.assertFalse(bp.isDivisible(8,5));
    }

    public void testGreet() {
        Assert.assertEquals(bp.greet("Johnny"),"Hello, my love!");
        Assert.assertEquals(bp.greet("John"),"Hello, John!");
    }

    public void testToBinary() {
        Assert.assertEquals(bp.toBinary(1),1);
        Assert.assertEquals(bp.toBinary(123),1111011);
        Assert.assertEquals(bp.toBinary(-5),0);
    }

    public void testPast() {
        Assert.assertEquals(bp.past(123,0,0),442800000);
    }

    public void testCentury() {
        Assert.assertEquals(bp.century(2020),21);
        Assert.assertEquals(bp.century(2000),20);
    }

    public void testMakeNegative() {
        Assert.assertEquals(bp.makeNegative(-1),1);
        Assert.assertEquals(bp.makeNegative(15),-15);
    }

    public void testDatingRange() {
        Assert.assertEquals(bp.datingRange(22),"18-30");
    }

    public void testWeatherInfo() {
       Assert.assertEquals(bp.weatherInfo(20),"-6.666666666666667 is freezing temperature");
       Assert.assertEquals(bp.weatherInfo(0),"-17.77777777777778 is freezing temperature");
    }

    public void testConvertToCelsius() {
        Assert.assertEquals((int)BasicProgramming.convertToCelsius(20),-6);
    }
}