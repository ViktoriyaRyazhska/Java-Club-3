package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllStarCodeChallengeNumber18Test {

    @Test
    void strCount() {
        assertEquals(1, AllStarCodeChallengeNumber18.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallengeNumber18.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallengeNumber18.strCount("",'z'));
    }

    @Test
    void test1() {
    }
}