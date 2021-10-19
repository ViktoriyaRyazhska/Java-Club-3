package com.softserve.Java_club_team_5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class ConditionsTest extends TestCase {
    Conditions cd=new Conditions();
        @Test
    public void testRN1(){

            Assert.assertEquals(cd.returnNegative(5),-5);
                    }
        @Test
    public void testRN2(){
               Assert.assertEquals(cd.returnNegative(-12),12);
    }

        @Test
    public void testIndivisible(){
            Assert.assertFalse(cd.indivisible(3,1,2));
            Assert.assertTrue(cd.indivisible(10,5,2));
        }

}