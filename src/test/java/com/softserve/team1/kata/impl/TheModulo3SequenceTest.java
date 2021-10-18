package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheModulo3SequenceTest {

    @Test
    void sequence() {
        assertEquals(2, TheModulo3Sequence.sequence(20));
        assertEquals(2, TheModulo3Sequence.sequence(148));
        assertEquals(2, TheModulo3Sequence.sequence(111));
        assertEquals(2, TheModulo3Sequence.sequence(118));
        assertEquals(0, TheModulo3Sequence.sequence(41));
        assertEquals(0, TheModulo3Sequence.sequence(85));
        assertEquals(0, TheModulo3Sequence.sequence(117));
        assertEquals(1, TheModulo3Sequence.sequence(82));
        assertEquals(1, TheModulo3Sequence.sequence(72));
        assertEquals(1, TheModulo3Sequence.sequence(5101394));
        assertEquals(1, TheModulo3Sequence.sequence(163));
        assertEquals(1, TheModulo3Sequence.sequence(90));
    }

    @Test
    void test1() {
    }
}