package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTheMeanOfArrayTest {


    @Test
    void getAverage() {
        assertEquals(2,GetTheMeanOfArray.getAverage(new ArrayList<String>(Arrays.asList("2","2","2","2","2"))));
        assertEquals(2,GetTheMeanOfArray.getAverage(new ArrayList<String>(Arrays.asList("1","2","3","4","5"))));
        assertEquals(2,GetTheMeanOfArray.getAverage(new ArrayList<String>(Arrays.asList("1","1","1","1","1","1","1","2"))));
    }

    @Test
    void test1() {
    }
}
