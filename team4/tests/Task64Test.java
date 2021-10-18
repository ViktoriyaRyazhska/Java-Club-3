package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task64;

import static org.junit.Assert.*;

public class Task64Test {

    @Test
    public void strCount() {
        Assert.assertEquals(3, Task64.strCount("bonomo",'o'));
        Assert.assertEquals(0, Task64.strCount("Java",'s'));
        Assert.assertEquals(1, Task64.strCount("Fight",'g'));
    }
}