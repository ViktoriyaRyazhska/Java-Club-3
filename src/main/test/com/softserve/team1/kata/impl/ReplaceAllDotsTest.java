package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceAllDotsTest {
    @Test
    public void testSomeDots() {
        assertEquals("one-two-three", ReplaceAllDots.replaceDots("one.two.three"), "Sorry, try again :-(");
    }

}