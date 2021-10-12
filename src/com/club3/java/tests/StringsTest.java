package com.club3.java.tests;

import com.club3.java.impl.StringsImpl;
import com.club3.java.utils.GrassHopper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {
    private StringsImpl stringsImpl = new StringsImpl();

    @Test
    public void correctMistakesOfCharacter() {
        assertEquals("I am a gOOd persOn", stringsImpl.correctMistakesOfCharacter("1 am a g00d pers0n"));
        assertEquals("SImpl prOgram", stringsImpl.correctMistakesOfCharacter("51mpl pr0gram"));
    }

    @Test
    public void tripleTrouble() {
        assertEquals("ttlheoiscstk", stringsImpl.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", stringsImpl.tripleTrouble("aa", "bb", "cc"));
    }

    @Test
    public void grasshopperDebug() {
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }
}
