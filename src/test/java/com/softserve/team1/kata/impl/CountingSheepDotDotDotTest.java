package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSheepDotDotDotTest {

    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    void countSheeps() {
        assertEquals( 17, new CountingSheepDotDotDot().countSheeps(array1));
    }

    @Test
    void test1() {
    }
}