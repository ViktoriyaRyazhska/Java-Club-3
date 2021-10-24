package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeRangeCompatibilityEquationTest {
    @Test
    void datingRange() {
        assertEquals("15-20", AgeRangeCompatibilityEquation.datingRange(17));
        assertEquals("27-66", AgeRangeCompatibilityEquation.datingRange(40));
        assertEquals("14-16", AgeRangeCompatibilityEquation.datingRange(15));
        assertEquals("24-56", AgeRangeCompatibilityEquation.datingRange(35));
        assertEquals("9-11", AgeRangeCompatibilityEquation.datingRange(10));
    }

    @Test
    void test1() {
    }
}
