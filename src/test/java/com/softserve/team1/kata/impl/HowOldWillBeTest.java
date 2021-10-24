package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowOldWillBeTest {

    @Test
    void CalculateAge() {
        assertEquals("You are 4 years old.", HowOldWillBe.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", HowOldWillBe.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", HowOldWillBe.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", HowOldWillBe.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", HowOldWillBe.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", HowOldWillBe.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", HowOldWillBe.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", HowOldWillBe.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", HowOldWillBe.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", HowOldWillBe.CalculateAge(2000, 1999));
    }

    @Test
    void test1() {
    }


}
