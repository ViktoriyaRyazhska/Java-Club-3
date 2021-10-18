package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.ThinkfulNumberDrillsPixelartPlanning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThinkfulNumberDrillsPixelartPlanningTest {
    @Test
    public void fixedTests() {
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(4050,27));
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10000,20));
        assertTrue(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10005,1));
        assertFalse(ThinkfulNumberDrillsPixelartPlanning.isDivisible(4066,27));
        assertFalse(ThinkfulNumberDrillsPixelartPlanning.isDivisible(10005,2));
    }

}