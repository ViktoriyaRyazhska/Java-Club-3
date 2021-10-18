package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task60;

import static org.junit.Assert.*;

public class Task60Test {
    Task60 task60 = new Task60();
    @Test
    public void fakeBin() {
        Assert.assertEquals("010011010101",task60.fakeBin("372185284916"));
        Assert.assertEquals("01011110001100111",task60.fakeBin("45385593107843568"));
        Assert.assertEquals("101000111101101",task60.fakeBin("509321967506747"));
    }
}