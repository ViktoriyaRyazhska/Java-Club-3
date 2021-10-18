package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task7;

import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void century() {
        Assert.assertEquals(21,Task7.century(2021));
        Assert.assertEquals(15,Task7.century(1494));
        Assert.assertEquals(18,Task7.century(1705));
    }
}