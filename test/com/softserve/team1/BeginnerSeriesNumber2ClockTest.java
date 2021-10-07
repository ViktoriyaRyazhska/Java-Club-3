package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerSeriesNumber2ClockTest {

    @Test
    public void clockTest(){

        assertEquals(61000, BeginnerSeriesNumber2Clock.Past(0,1,1));
    }
}