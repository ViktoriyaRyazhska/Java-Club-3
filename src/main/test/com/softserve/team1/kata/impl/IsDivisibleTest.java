package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsDivisibleTest {
    @Test
    public void test1() {
        assertTrue(IsDivisible.isDivisible(12, 4, 3));
    }
    @Test
    public void test2() {
        assertFalse(IsDivisible.isDivisible(3, 3, 4));
    }

}