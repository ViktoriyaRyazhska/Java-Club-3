package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreYouPlayingBanjoTest {

    @Test
    void areYouPlayingBanjo() {
        assertEquals( "Martin does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Rikke"));
    }

    @Test
    void test1() {
    }
}