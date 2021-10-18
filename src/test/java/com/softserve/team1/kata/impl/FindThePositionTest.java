package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.FindThePosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThePositionTest {
    @Test
    public void basicTests() {
        Assertions.assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
        assertEquals("Position of alphabet: 26", FindThePosition.position('z'));
        assertEquals("Position of alphabet: 5", FindThePosition.position('e'));
    }

}