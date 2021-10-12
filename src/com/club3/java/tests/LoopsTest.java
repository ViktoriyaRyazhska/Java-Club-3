package com.club3.java.tests;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LoopsTest {
    com.club3.java.impl.LoopsImpl loops = new com.club3.java.impl.LoopsImpl();

    @Test
    public void map35() {
        assertArrayEquals(new int[] {2, 4, 6}, loops.map35(new int[] {1, 2, 3}));
    }
    @Test
    public void grow39() {
        assertEquals(6, loops.grow39(new int[] {1, 2, 3}));
    }
    @Test
    public void findNearestSquare43() {
        assertEquals(4, loops.findNearestSquare43(5));
    }
}
