package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task28;

import static org.junit.Assert.*;

public class Task28Test {
    Task28 task28 = new Task28();
    @Test
    public void mod() {
        Assert.assertEquals(0,task28.mod(117));
        Assert.assertEquals(0,task28.mod(85));
        Assert.assertEquals(1,task28.mod(82));
        Assert.assertEquals(1,task28.mod(72));
        Assert.assertEquals(2,task28.mod(111));
        Assert.assertEquals(2,task28.mod(20));
    }
}