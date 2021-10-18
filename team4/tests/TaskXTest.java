package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.TaskX;

import static org.junit.Assert.*;

public class TaskXTest {
    TaskX taskX = new TaskX();
    @Test
    public void multiply() {
        Assert.assertEquals(10,taskX.multiply(5,2));
        Assert.assertEquals(25,taskX.multiply(5,5));
        Assert.assertEquals(3,taskX.multiply(1,3));
    }
}