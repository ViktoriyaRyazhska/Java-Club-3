package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyingTwoNumbersTest {

    @Test
    void multiply() {
        assertEquals(4, MultiplyingTwoNumbers.multiply(2, 2));
        assertEquals(10, MultiplyingTwoNumbers.multiply(5, 2));
        assertEquals(100, MultiplyingTwoNumbers.multiply(100, 1));
        assertEquals(0, MultiplyingTwoNumbers.multiply(0, 1000));
    }

    @Test
    void test1() {
    }
}
