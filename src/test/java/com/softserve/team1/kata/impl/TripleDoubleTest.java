package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripleDoubleTest {
    @Test
    void tripleTrouble() {
        assertEquals("ttlheoiscstk", TripleDouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleDouble.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleDouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleDouble.tripleTrouble("LLh","euo","xtr"));
    }

    @Test
    void test1() {
    }
}
