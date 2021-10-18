package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task17;

import static org.junit.Assert.*;

public class Task17Test {
    Task17 task17 = new Task17(2,4,6);
    @Test
    public void getWidth() {
        Assert.assertEquals(2,task17.getWidth());
    }

    @Test
    public void getLength() {
        Assert.assertEquals(4,task17.getLength());
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(6,task17.getHeight());
    }

    @Test
    public void getVolume() {
        Assert.assertEquals(48,task17.getVolume());
    }

    @Test
    public void getSurfaceArea() {
        Assert.assertEquals(88,task17.getSurfaceArea());
    }
}