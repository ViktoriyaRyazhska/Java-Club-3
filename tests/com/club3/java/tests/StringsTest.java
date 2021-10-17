package com.club3.java.tests;

import com.club3.java.Strings;
import com.club3.java.impl.StringsImpl;
import com.club3.java.utils.GrassHopper;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class StringsTest {
    private StringsImpl stringsImpl = new StringsImpl();
    private Strings strings1 = new Strings();
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void numberToString51() {
        assertEquals("1234", stringsImpl.numberToString51(1234));
    }

    @Test
    public void replaceDots55() {
        assertEquals("A-a", stringsImpl.replaceDots55("A.a"));
    }

    @Test
    public void position59() {
        assertEquals("Position of alphabet: 2", stringsImpl.position59('b'));
    }

    @Test
    public void abbrevName63() {
        assertEquals("T.O", stringsImpl.abbrevName63("taras o"));
    }

    @Test
    public void toAlternativeString67() {
        assertEquals("AB cd", stringsImpl.toAlternativeString67("ab CD"));
    }

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

    @Test
    public void scannerInput_grasshopperDebug() {
        systemInMock.provideLines("50");
        assertEquals("10.0 is above freezing temperature", strings1.grasshopperDebug());
        systemInMock.provideLines("23");
        assertEquals("-5.0 is freezing temperature", strings1.grasshopperDebug());
    }

    @Test
    public void scannerInput_correctMistakesOfCharacter() {
        systemInMock.provideLines("1 am a g00d pers0n");
        assertEquals("I am a gOOd persOn", strings1.correctMistakesOfCharacter());
    }

    @Test
    public void scannerInput_tripleTrouble() {
        systemInMock.provideLines("aaa", "bbb", "ccc");
        assertEquals("abcabcabc", strings1.tripleTrouble());
    }

    @Test
    public void scannerInput_toAlternativeString() {
        systemInMock.provideLines("StringUtils.toAlternatingCase");
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", strings1.toAlternativeString());
    }

    @Test
    public void scannerInput_numberToString51() {
        systemInMock.provideLines("5");
        assertEquals(String.valueOf(5), strings1.numberToString51());
    }

    @Test
    public void scannerInput_replaceDots55() {
        systemInMock.provideLines("one.two.three");
        assertEquals("one-two-three", strings1.replaceDots55());
    }

    @Test
    public void scannerInput_position59() {
        systemInMock.provideLines("a");
        assertEquals("Position of alphabet: " + 1, strings1.position59());
        systemInMock.provideLines("b");
        assertEquals("Position of alphabet: " + 2, strings1.position59());
    }

    @Test
    public void scannerInput_abbrevName63() {
        systemInMock.provideLines("Sam Harris");
        assertEquals("S.H", strings1.abbrevName63());
    }

    @Test
    public void scannerInput_toAlternativeString67() {
        systemInMock.provideLines("AB cd");
        assertEquals("ab CD", strings1.toAlternativeString67());
    }
}
