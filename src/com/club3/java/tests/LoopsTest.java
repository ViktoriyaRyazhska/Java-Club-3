package com.club3.java.tests;


import com.club3.java.Loops;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class LoopsTest {

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    private com.club3.java.impl.LoopsImpl loops = new com.club3.java.impl.LoopsImpl();
    private Loops loops1 = new Loops();


    @Test
    public void map35() {
        systemInMock.provideLines("3", "1", "2", "3");
       assertEquals("[2, 4, 6]",loops1.map35());
    }

    @Test
    public void grow39() {
        systemInMock.provideLines("3", "1", "2", "3");
        assertEquals(6,loops1.grow39());
    }

    @Test
    public void findNearestSquare43() {
        systemInMock.provideLines("3");
        assertEquals(4,loops1.findNearestSquare43());
    }

    @Test
    public void twiceAsOld() {
        assertEquals(30, loops.twiceAsOld(30, 0));
        assertEquals(16, loops.twiceAsOld(30, 7));
        assertEquals(15, loops.twiceAsOld(45, 30));
    }

    @Test
    public void getTheMeanOfAnArray() {
        systemInMock.provideLines("4", "4", "4", "4", "4");
        assertEquals(4, loops1.getTheMeanOfAnArray());
    }

    @Test
    public void howGoodAreYouReally() {
        systemInMock.provideLines("80", "6", "80", "100", "75", "82", "63", "88");
        assertEquals("False", loops1.howGoodAreYouReally());

        systemInMock.provideLines("85", "6", "80", "100", "75", "82", "63", "88");
        assertEquals("True", loops1.howGoodAreYouReally());
    }

}

