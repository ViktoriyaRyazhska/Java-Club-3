package com.softserve.Java_club_team_5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringManagementTest {

    StringManagement stm=new StringManagement();
    @Test
    public void testStrTransform() {
        Assert.assertEquals(stm.strTransform(5),"5");
    }

    @Test
    public void testStrReverse() {
        Assert.assertEquals(stm.strReverse("Hello"),"olleH");
    }

    @Test
    public void testStrOpposite() {
        Assert.assertEquals(stm.strOpposite("-5"),"5");
        Assert.assertEquals(stm.strOpposite("12"),"-12");
    }

    @Test
    public void testSayHello() {
        String [] s={"John","Johnson"};
        Assert.assertEquals(stm.sayHello(s,"Manchester"),"Hello, John Johnson! Welcome to Manchester!");
    }

    @Test
    public void testReplaceDots() {
        Assert.assertEquals(stm.replaceDots("9090...9090..."),"9090---9090---");
    }

    @Test
    public void testAreYouPlayingBanjo() {
        Assert.assertEquals(stm.areYouPlayingBanjo("Ramon"),"Ramon plays banjo");
        Assert.assertEquals(stm.areYouPlayingBanjo("Gerald"),"Gerald does not play banjo");
    }

    @Test
    public void testNoSpace() {
        Assert.assertEquals(stm.noSpace("Hello World !"),"HelloWorld!");
    }

    @Test
    public void testTripleTrouble() {
        Assert.assertEquals(stm.tripleTrouble("two","two","two"),"tttwwwooo");
        Assert.assertEquals(stm.tripleTrouble("three","two","n"),"ttnhwroee");
    }

    @Test
    public void testFakeBinary(){
        Assert.assertEquals( FakeBinary.convert("23463487569023457").toString(),"00010011111000011");
    }
}