package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.LombokEncapsulationKata;
import com.softserve.team1.models.LombokEncapsulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LombokEncapsulationKataTest {
    @Test
    public void testSample() {
        LombokEncapsulation ed = new LombokEncapsulation();
        assertEquals(0, ed.getNumber());
    }
}