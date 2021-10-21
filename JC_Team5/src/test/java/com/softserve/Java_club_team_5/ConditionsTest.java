package com.softserve.Java_club_team_5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class ConditionsTest extends TestCase {
    Conditions cd=new Conditions();
        @Test
    public void testReturnNegative(){
            Assert.assertEquals(cd.returnNegative(5),-5);
            Assert.assertEquals(cd.returnNegative(-12),12);
      }

       @Test
    public void testIndivisible(){
            Assert.assertFalse(cd.indivisible(3,1,2));
            Assert.assertTrue(cd.indivisible(10,5,2));
            Assert.assertFalse(cd.indivisible(5,2,3));
           Assert.assertFalse(cd.indivisible(5,4,2));
        }
    public void testConvertBool(){
            Assert.assertTrue(cd.convertBool(1));
            Assert.assertFalse(cd.convertBool(0));
    }
    public void  testBonuses(){
            Assert.assertEquals((int)cd.bonuses(1,true),10);
            Assert.assertEquals((int)cd.bonuses(1,false),1);
    }
    public void testCalculateAge(){
            Assert.assertEquals(cd.CalculateAge(2000,2020),"You are 20 years old.");
            Assert.assertEquals(cd.CalculateAge(2000,1995),"You will be born in 5 years.");
            Assert.assertEquals(cd.CalculateAge(3000,3000),"You were born this very year!");
    }
    public void testRPS(){
        Assert.assertEquals(cd.rps("paper","paper"),"Draw!");
        Assert.assertEquals(cd.rps("scissors","paper"),"Player 1 won!");
        Assert.assertEquals(cd.rps("rock","paper"),"Player 2 won!");
    }
    public void testBasicMath(){
            Assert.assertEquals(cd.basicMath("+",1,1), 2);
            Assert.assertEquals(cd.basicMath("-",1,1), 0);
            Assert.assertEquals(cd.basicMath("/",1,1), 1);
            Assert.assertEquals(cd.basicMath("*",1,1), 1);
            Assert.assertEquals(cd.basicMath("/",1,0), 0);
    }
    public void testIsLove(){
            Assert.assertTrue(cd.isLove(2,3));
            Assert.assertFalse(cd.isLove(2,2));
    }
    public void testModulo(){
            Assert.assertEquals(TheModulo3Sequence.modulo(),"1134903170");
    }
    public void testSwitchItUp(){
            Assert.assertEquals(SwitchItUp.convert(0), "Zero");
            Assert.assertEquals(SwitchItUp.convert(1), "One");
            Assert.assertEquals(SwitchItUp.convert(2), "Two");
            Assert.assertEquals(SwitchItUp.convert(3), "Three");
            Assert.assertEquals(SwitchItUp.convert(4), "Four");
            Assert.assertEquals(SwitchItUp.convert(5), "Five");
            Assert.assertEquals(SwitchItUp.convert(6), "Six");
            Assert.assertEquals(SwitchItUp.convert(7), "Seven");
            Assert.assertEquals(SwitchItUp.convert(8), "Eight");
            Assert.assertEquals(SwitchItUp.convert(9), "Nine");
            Assert.assertEquals(SwitchItUp.convert(12),"Invalid value.");
    }
    public void testBoolToStr(){
            Assert.assertEquals(BooleanValueToString.boolToWord(true),"Yes");
            Assert.assertEquals(BooleanValueToString.boolToWord(false),"No");
    }
    public void testWillBeThereEnoughPlace(){
            Assert.assertEquals(WillBeThereEnoughSpace.checkFreePlaces(12,8,5),"He cant fit all 1 of the 5 waiting.");
            Assert.assertEquals(WillBeThereEnoughSpace.checkFreePlaces(12,5,5),"He can fit all 5 passengers.");
    }


}