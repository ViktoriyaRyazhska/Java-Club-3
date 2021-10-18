package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BasicOperationsTest {

    @Test
    void basicMath() {
        assertEquals(BasicOperations.basicMath("+", 4, 7), 11);
        assertEquals(BasicOperations.basicMath("-", 15, 18), -3);
        assertEquals(BasicOperations.basicMath("*", 5, 5), 25);
        assertEquals(BasicOperations.basicMath("/", 49, 7), 7);
    }

    @Test
    void test1() {
    }
}