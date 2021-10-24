package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToBinaryTest {
    @Test
    void toBinary() {
        assertEquals(1, ConvertToBinary.toBinary(1));
        assertEquals(10, ConvertToBinary.toBinary(2));
        assertEquals(11, ConvertToBinary.toBinary(3));
        assertEquals(101, ConvertToBinary.toBinary(5));
    }

    @Test
    void test1() {
    }
}
