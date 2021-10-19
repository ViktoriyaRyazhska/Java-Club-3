package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.ParceNiceIntFromCharProblem;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ParceNiceIntFromCharProblemTest {

    @Test
    void howOld() {
    }

    @Test
    void test1() {
        Assert.assertEquals(5, ParceNiceIntFromCharProblem.howOld("5 years old"));
        Assert.assertEquals(9, ParceNiceIntFromCharProblem.howOld("9 years old"));
        Assert.assertEquals(1, ParceNiceIntFromCharProblem.howOld("1 year old"));
    }
}