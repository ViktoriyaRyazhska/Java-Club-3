package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task20;

import static org.junit.Assert.*;

public class Task20Test {

    @Test
    public void convert() {
        Assert.assertEquals("true", Task20.convert(true));
        Assert.assertEquals("false", Task20.convert(false));
    }

}