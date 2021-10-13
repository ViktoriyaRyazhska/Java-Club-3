package com.club3.java.tests;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LoopsTest {
    com.club3.java.impl.LoopsImpl loops = new com.club3.java.impl.LoopsImpl();


    @Test
    public void twiceAsOld() {
        assertEquals(30, loops.twiceAsOld(30, 0));
        assertEquals(16, loops.twiceAsOld(30, 7));
        assertEquals(15, loops.twiceAsOld(45, 30));
    }
}

