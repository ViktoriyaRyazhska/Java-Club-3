package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task40;

import static org.junit.Assert.*;

public class Task40Test {

    @Test
    public void sum() {
        Assert.assertEquals(5, Task40.sum(new int[]{2,1,2}));
        Assert.assertEquals(8, Task40.sum(new int[]{2,1,2,3}));
        Assert.assertEquals(13, Task40.sum(new int[]{2,1,2,4,3,1}));
    }
}