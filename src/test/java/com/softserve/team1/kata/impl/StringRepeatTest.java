package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRepeatTest {

    @Test
    void repeatStr() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
        assertEquals("", StringRepeat.repeatStr(5, ""));
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }

    @Test
    void test1() {
    }
}