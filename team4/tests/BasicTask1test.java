import org.junit.Assert;
import org.junit.jupiter.api.Test;
import svyshcho_illya.BasicTask1;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class BasicTask1test {
    BasicTask1 basicTask1 = new BasicTask1();

    @Test
    public void doubleInteger(){
        assertEquals(4,basicTask1.doubleInteger(2));
    }
    @Test
    public void Past(){
        assertEquals(61000, basicTask1.Past(0,1,1));
    }
    @Test
    public void isDivisible() {
        assertTrue(basicTask1.isDivisible(4050,27));
        assertTrue(basicTask1.isDivisible(10000,20));
        assertTrue(basicTask1.isDivisible(10005,1));
        assertFalse(basicTask1.isDivisible(4066,27));
        assertFalse(basicTask1.isDivisible(10005,2));
    }
    @Test
    public void datingRange(){
        assertEquals("15-20", basicTask1.datingRange(17));
        assertEquals("27-66", basicTask1.datingRange(40));
        assertEquals("14-16", basicTask1.datingRange(15));
        assertEquals("24-56", basicTask1.datingRange(35));
        assertEquals("9-11", basicTask1.datingRange(10));
    }
//    @Test
//    public void Fighter() {
//        assertEquals("Lew", basicTask1.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
//        assertEquals("Harry", basicTask1.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
//        assertEquals("Harald", basicTask1.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
//        assertEquals("Harald", basicTask1.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
//        assertEquals("Harald", basicTask1.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
//        assertEquals("Harald", basicTask1.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
//    }
    @Test
    public void isDivisiblex() {
    assertEquals(true, basicTask1.isDivisiblex(12,4,3));
}
    @Test
    public void test2() {
        assertEquals(false, basicTask1.isDivisiblex(3,3,4));
    }
    @Test
    public void testAge() {
        assertEquals(4, basicTask1.CalculateAge(2012, 2016));
        assertEquals(27, basicTask1.CalculateAge(1989, 2016));
        assertEquals(90, basicTask1.CalculateAge(2000, 2090));
        assertEquals(10, basicTask1.CalculateAge(2000, 1990));
        assertEquals(0, basicTask1.CalculateAge(3400, 3400));
        assertEquals(2000, basicTask1.CalculateAge(900, 2900));
        assertEquals(110, basicTask1.CalculateAge(2010, 1900));
        assertEquals(510, basicTask1.CalculateAge(2010, 1500));
        assertEquals(1, basicTask1.CalculateAge(2011, 2012));
        assertEquals(1, basicTask1.CalculateAge(2000, 1999));
    }
    @Test
    public void sequence() {
        assertEquals(2, basicTask1.sequence(20));
        assertEquals(2, basicTask1.sequence(148));
        assertEquals(2, basicTask1.sequence(111));
        assertEquals(2, basicTask1.sequence(118));
        assertEquals(0, basicTask1.sequence(41));
        assertEquals(0, basicTask1.sequence(85));
        assertEquals(0, basicTask1.sequence(117));
        assertEquals(1, basicTask1.sequence(82));
        assertEquals(1, basicTask1.sequence(72));
        assertEquals(1, basicTask1.sequence(5101394));
        assertEquals(1, basicTask1.sequence(163));
        assertEquals(1, basicTask1.sequence(90));
    }
    @Test
    public void rentalCarCost() {
        assertEquals(40, basicTask1.rentalCarCost(1));
        assertEquals(80, basicTask1.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, basicTask1.rentalCarCost(3));
        assertEquals(140, basicTask1.rentalCarCost(4));
        assertEquals(180, basicTask1.rentalCarCost(5));
        assertEquals(220, basicTask1.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, basicTask1.rentalCarCost(7));
        assertEquals(270, basicTask1.rentalCarCost(8));
        assertEquals(310, basicTask1.rentalCarCost(9));
        assertEquals(350, basicTask1.rentalCarCost(10));
    }
    @Test
    public void map() {
        assertEquals("[2, 4, 6]", basicTask1.map(3,new int[] {1, 2, 3}));
        assertEquals("[8, 2, 2, 2, 8]", basicTask1.map(5,new int[] {4, 1, 1, 1, 4}));
        assertEquals("[2, 2, 2, 2, 2, 2]", basicTask1.map(6,new int[] {1, 1, 1, 1, 1, 1}));
    }
    @Test
    public void grow() {
        assertEquals(6, basicTask1.grow(3,new int[]{1,2,3}));
        assertEquals(16, basicTask1.grow(5,new int[]{4,1,1,1,4}));
        assertEquals(64, basicTask1.grow(6,new int[]{2,2,2,2,2,2}));
    }
    @Test
    public void nearestSq() {
        assertEquals(1, basicTask1.nearestSq(1));
        assertEquals(1, basicTask1.nearestSq(2));
        assertEquals(9, basicTask1.nearestSq(10));
        assertEquals(121, basicTask1.nearestSq(111));
        assertEquals(10000, basicTask1.nearestSq(9999));
    }
    @Test
    public void numberToString() {
        assertEquals("67", basicTask1.numberToString(67));
        assertEquals("123", basicTask1.numberToString(123));
        assertEquals("999", basicTask1.numberToString(999));
    }
    @Test
    public void replaceDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(basicTask1.replaceDots("one.two.three")));
    }
    @Test
    public void position() {
        assertEquals(1, basicTask1.position('a'));
        assertEquals(26, basicTask1.position('z'));
        assertEquals(5, basicTask1.position('e'));
    }
    @Test
    public void abbrevName() {
        assertEquals("S.H", basicTask1.abbrevName("Sam Harris"));
        assertEquals("P.F", basicTask1.abbrevName("Patrick Feenan"));
        assertEquals("E.C", basicTask1.abbrevName("Evan Cole"));
        assertEquals("P.F", basicTask1.abbrevName("P Favuzzi"));
        assertEquals("D.M", basicTask1.abbrevName("David Mendieta"));
    }
    @Test
    public void toAlternativeString() {
        assertEquals("HELLO WORLD", basicTask1.toAlternativeString("hello world"));
        assertEquals("hello world", basicTask1.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", basicTask1.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", basicTask1.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", basicTask1.toAlternativeString(basicTask1.toAlternativeString("Hello World")));
        assertEquals("12345", basicTask1.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", basicTask1.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", basicTask1.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", basicTask1.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", basicTask1.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", basicTask1.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", basicTask1.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }







}

