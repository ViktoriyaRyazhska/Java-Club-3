package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationMarksSeriesTest {

    @Test
    void remove() {
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!", 100));
        assertEquals("Hi!!", ExclamationMarksSeries.remove("Hi!!!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!!!", 100));
        assertEquals("Hi", ExclamationMarksSeries.remove("!Hi", 1));
        assertEquals("Hi!", ExclamationMarksSeries.remove("!Hi!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 100));
    }

    @Test
    void test1() {
    }
}