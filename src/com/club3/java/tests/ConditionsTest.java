package com.club3.java.tests;

import com.club3.java.Conditions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class ConditionsTest {
    private com.club3.java.impl.ConditionsImpl conditions = new com.club3.java.impl.ConditionsImpl();
    private Conditions conditions1 = new Conditions();
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

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

    @Test
    public void bonusTime() {
        assertEquals("\u00A3" + 10000, conditions.bonusTime(1000, true));
        assertEquals("\u00A3" + 1000, conditions.bonusTime(1000, false));
        assertEquals("\u00A3" + 12340, conditions.bonusTime(1234, true));
        assertEquals("\u00A3" + 0, conditions.bonusTime(0, true));
    }

    @Test
    public void isLove() {
        assertTrue(conditions.isLove(0, 1));
        assertTrue(conditions.isLove(3, 0));
        assertFalse(conditions.isLove(2, 4));
        assertFalse(conditions.isLove(9, 7));
        assertTrue(conditions.isLove(7, 10));
    }

    @Test
    public void switchItUp() {
        assertEquals("Zero", conditions.switchItUp(0));
        assertEquals("Five", conditions.switchItUp(5));
        assertEquals("Seven", conditions.switchItUp(7));
        assertEquals("Three", conditions.switchItUp(3));
    }

    @Test
    public void scannerInput_oppositeNumber() {
        systemInMock.provideLines("4");
        assertEquals(-4, conditions1.oppositeNumber());
    }

    @Test
    public void scannerInput_howOldWillIBeIn2099() {
        systemInMock.provideLines("2012", "2016");
        assertEquals("You are 4 years old.", conditions1.howOldWillIBeIn2099());
    }

    @Test
    public void scannerInput_convertBooleanValuesToStrings() {
        systemInMock.provideLines("true");
        assertEquals("Yes", conditions1.convertBooleanValuesToStrings());
        systemInMock.provideLines("false");
        assertEquals("No", conditions1.convertBooleanValuesToStrings());
    }

    @Test
    public void scannerInput_trafficLight() {
        systemInMock.provideLines("green");
        assertEquals("yellow", conditions1.trafficLight());
        systemInMock.provideLines("yellow");
        assertEquals("red", conditions1.trafficLight());
        systemInMock.provideLines("red");
        assertEquals("green", conditions1.trafficLight());
    }
}
