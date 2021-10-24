package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHopperTest {
    @Test
    void weatherInfo() {
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }

    @Test
    void test1() {
    }
}
