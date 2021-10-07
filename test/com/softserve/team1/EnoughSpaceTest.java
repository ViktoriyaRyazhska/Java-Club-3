package com.softserve.team1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnoughSpaceTest {

    @Test
    public void test() {
        assertEquals(0, EnoughSpace.enough(10, 5, 5));
        assertEquals(10, EnoughSpace.enough(100, 60, 50));
        assertEquals( 0, EnoughSpace.enough(20, 5, 5));
    }
}