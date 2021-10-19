package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.OppositesAttract;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class OppositesAttractTest {

    @Test
    void isLove() {
    }

    @Test
    void test1() {
    }
    @Test
    public void testOddAndEven() {
        Assert.assertTrue(OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        Assert.assertFalse(OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        Assert.assertFalse(OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        Assert.assertTrue(OppositesAttract.isLove(0, 1));
    }
}