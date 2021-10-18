package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task32;

import static org.junit.Assert.*;

public class Task32Test {

    @Test
    public void repeatStr() {
        Assert.assertEquals("sssssssss", Task32.repeatStr(9,"s"));
        Assert.assertEquals("GoodGoodGood", Task32.repeatStr(3,"Good"));
        Assert.assertEquals("HiHiHiHiHi", Task32.repeatStr(5,"Hi"));
    }
}