package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task10;

import static org.junit.Assert.*;

public class Task10Test {

    @Test
    public void weatherInfo() {
        Assert.assertEquals("0.0 is above freezing temperature", Task10.weatherInfo(32));
        Assert.assertEquals("-5.0 is freezing temperature", Task10.weatherInfo(23));
        Assert.assertEquals("10.0 is above freezing temperature", Task10.weatherInfo(50));
    }
}