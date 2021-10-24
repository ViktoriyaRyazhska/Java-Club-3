package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeNumberTest {
    @Test
    void opposite() {
        assertEquals(-1, OppositeNumber.opposite(1));
        assertEquals(5, OppositeNumber.opposite(-5));
    }

    @Test
    void test1() {
    }
}
