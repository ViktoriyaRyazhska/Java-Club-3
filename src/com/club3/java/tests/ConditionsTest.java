package com.club3.java.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionsTest {
    com.club3.java.impl.ConditionsImpl conditions = new com.club3.java.impl.ConditionsImpl();

    @Test
    public void divinity19() {
        assertEquals("n = 1 is divisible on x = 1 y = 1", conditions.divinity19(1, 1, 1));
        assertEquals("n = 1 is divisible on x = 1 but not on y = 2", conditions.divinity19(1, 1, 2));
        assertEquals("n = 1 not divisible on x = 2 but divisible on y = 1", conditions.divinity19(1, 2, 1));
        assertEquals("n = 1 not divisible on x = 2 y = 2", conditions.divinity19(1, 2, 2));
    }

    @Test
    public void rps23() {
        assertEquals("Player 1 won!", conditions.rps23("scissors", "paper"));
    }

    @Test
    public void enough27() {
        assertEquals(0, conditions.enough27(10, 5, 5));
        assertEquals(10, conditions.enough27(10, 10, 10));

    }

    @Test
    public void rentalCarCost31() {
        assertEquals(40, conditions.rentalCarCost31(1));
        assertEquals(80, conditions.rentalCarCost31(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, conditions.rentalCarCost31(3));
        assertEquals(140, conditions.rentalCarCost31(4));
        assertEquals(180, conditions.rentalCarCost31(5));
        assertEquals(220, conditions.rentalCarCost31(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, conditions.rentalCarCost31(7));
        assertEquals(270, conditions.rentalCarCost31(8));
        assertEquals(310, conditions.rentalCarCost31(9));
        assertEquals(350, conditions.rentalCarCost31(10));
    }

    @Test
    public void oppositeNumber() {
        assertEquals(-11, conditions.oppositeNumber(11));
        assertEquals(0, conditions.oppositeNumber(0));
    }

    @Test
    public void howOldWillIBeIn2099() {
        assertEquals("You are 4 years old.", conditions.howOldWillIBeIn2099(2012, 2016));
        assertEquals("You are 27 years old.", conditions.howOldWillIBeIn2099(1989, 2016));
        assertEquals("You are 90 years old.", conditions.howOldWillIBeIn2099(2000, 2090));
        assertEquals("You will be born in 10 years.", conditions.howOldWillIBeIn2099(2000, 1990));
        assertEquals("You were born this very year!", conditions.howOldWillIBeIn2099(3400, 3400));
        assertEquals("You are 2000 years old.", conditions.howOldWillIBeIn2099(900, 2900));
        assertEquals("You will be born in 110 years.", conditions.howOldWillIBeIn2099(2010, 1900));
        assertEquals("You will be born in 510 years.", conditions.howOldWillIBeIn2099(2010, 1500));
        assertEquals("You are 1 years old.", conditions.howOldWillIBeIn2099(2011, 2012));
        assertEquals("You will be born in 1 years.", conditions.howOldWillIBeIn2099(2000, 1999));
    }

    @Test
    public void convertBooleanValuesToStrings() {
        assertEquals("Yes", conditions.convertBooleanValuesToStrings("true"));
        assertEquals("No", conditions.convertBooleanValuesToStrings("false"));
    }

    @Test
    public void trafficLight() {
        assertEquals("green", conditions.trafficLight("red"));
        assertEquals("yellow", conditions.trafficLight("green"));
        assertEquals("red", conditions.trafficLight("yellow"));

    }


}
