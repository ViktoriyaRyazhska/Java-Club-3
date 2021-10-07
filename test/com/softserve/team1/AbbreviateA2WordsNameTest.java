package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviateA2WordsNameTest {
    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateA2WordsName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateA2WordsName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateA2WordsName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateA2WordsName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateA2WordsName.abbrevName("David Mendieta"));
    }
}