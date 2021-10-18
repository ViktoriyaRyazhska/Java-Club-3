package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.AbbreviateA2WordsName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbbreviateA2WordsNameTest {

    @Test
    public void testFixed() {
        Assertions.assertEquals("S.H", AbbreviateA2WordsName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateA2WordsName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateA2WordsName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateA2WordsName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateA2WordsName.abbrevName("David Mendieta"));
    }
}