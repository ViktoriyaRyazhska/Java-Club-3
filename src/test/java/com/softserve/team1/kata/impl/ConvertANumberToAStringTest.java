package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.ConvertANumberToAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertANumberToAStringTest {
    @Test
    public void tests() {
        Assertions.assertEquals("67", ConvertANumberToAString.numberToString(67));
        assertEquals("123", ConvertANumberToAString.numberToString(123));
        assertEquals("999", ConvertANumberToAString.numberToString(999));
    }

}