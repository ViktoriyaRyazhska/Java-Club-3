package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.FindNearestSquareNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNearestSquareNumberTest {
    @Test
    public void basicTests() {
        Assertions.assertEquals(1, FindNearestSquareNumber.nearestSq(1));
        assertEquals(1, FindNearestSquareNumber.nearestSq(2));
        assertEquals(9, FindNearestSquareNumber.nearestSq(10));
        assertEquals(121, FindNearestSquareNumber.nearestSq(111));
        assertEquals(10000, FindNearestSquareNumber.nearestSq(9999));
    }

}