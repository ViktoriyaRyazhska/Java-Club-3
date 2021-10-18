package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task25;

import static org.junit.Assert.*;

public class Task25Test {
    Task25 task25 = new Task25();
    @Test
    public void isLove() {
        Assert.assertEquals(false,task25.isLove(2,2));
        Assert.assertEquals(true,task25.isLove(1,4));
        Assert.assertEquals(false,task25.isLove(1,1));
    }
}