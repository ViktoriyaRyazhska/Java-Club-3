package com.softserve.Java_club_team_5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LoopsTest extends TestCase {


    Loops lp=new Loops();
    HowGoodAreYouReally hg=new HowGoodAreYouReally();
    public void testRepeatString() {
        Assert.assertEquals(lp.repeatString(5,"i"),"iiiii");
        Assert.assertEquals(lp.repeatString(10,"@"),"@@@@@@@@@@");
        Assert.assertEquals(lp.repeatString(0,"i"),"");
    }

    public void testCatDogYears() {
        Assert.assertEquals(lp.catDogYears(1),"Cat is 15 y.o.; Dog is 15 y.o.");
        Assert.assertEquals(lp.catDogYears(2),"Cat is 24 y.o.; Dog is 24 y.o.");
        Assert.assertEquals(lp.catDogYears(5),"Cat is 36 y.o.; Dog is 39 y.o.");
    }

    public void testMean() {
        int [] i={2,5,6};
        Assert.assertEquals((int)lp.mean(i),4);
        i=new int[]{1,2,3,7,5,6,7,};
        Assert.assertEquals((int)lp.mean(i),4);
        i=null;
    }

    public void testMap() {
        int i []={5,6};
        Assert.assertEquals(Arrays.toString(lp.map(i)),"[10, 12]");
        i=null;
    }

    public void testCountSheeps() {
        Boolean b[] ={true,false,true};
        Assert.assertEquals(lp.countSheeps(b),2);
    }

    public void testReverse() {
        int i []={2,1};
        Assert.assertEquals(Arrays.toString(lp.reverse(2)),"[2, 1]");
    }

    public void testHowGood(){

    }
    public void testGrowth(){
            Assert.assertEquals(BeginnerReduceButGrow.calculateGrow(10),362880);
    }
    public void testSum(){
        int []i={1,1,1,1,1,1};
        Assert.assertEquals(SumOfPositive.sum(i),6);
    }

}