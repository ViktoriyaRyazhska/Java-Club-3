package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassHopperSummationTest {

    @Test
    void summation() {
        assertEquals(1, GrassHopperSummation.summation(1));
        assertEquals(36, GrassHopperSummation.summation(8));
    }

    @Test
    void test1() {
    }
}