package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBooleanValuesTest {
    @Test
    void boolToWord() {
        assertEquals(ConvertBooleanValues.boolToWord(true),"Yes");
        assertEquals(ConvertBooleanValues.boolToWord(false),"No");
    }

    @Test
    void test1() {
    }
}
