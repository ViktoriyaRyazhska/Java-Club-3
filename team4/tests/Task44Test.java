package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task44;

import static org.junit.Assert.*;

public class Task44Test {

    @Test
    public void summation() {
        Assert.assertEquals(28, Task44.summation(7));
        Assert.assertEquals(21, Task44.summation(6));
        Assert.assertEquals(45, Task44.summation(9));
    }
}