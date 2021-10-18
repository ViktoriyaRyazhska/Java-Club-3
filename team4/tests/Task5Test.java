package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task5;

import static org.junit.Assert.*;

public class Task5Test {
    Task5 task5 = new Task5();
    @Test
    public void greet() {
        Assert.assertEquals("Hello, my love!", task5.greet("Johnny"));
        Assert.assertEquals("Hello, Jim!",task5.greet("Jim"));
        Assert.assertEquals("Hello, Den!",task5.greet("Den"));
    }
}