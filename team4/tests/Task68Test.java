package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task68;

import static org.junit.Assert.*;

public class Task68Test {

    @Test
    public void remove() {
        Assert.assertEquals("Hello!!!", Task68.remove("Hello!!!!!",2));
        Assert.assertEquals("Hello", Task68.remove("!!!!Hello!!!!!",9));
        Assert.assertEquals("Hello!", Task68.remove("!!!!Hello!",4));
    }
}