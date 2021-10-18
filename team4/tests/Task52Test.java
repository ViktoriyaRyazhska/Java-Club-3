package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task52;

import static org.junit.Assert.*;

public class Task52Test {

    @Test
    public void solution() {
        Assert.assertEquals("olleH", Task52.solution("Hello"));
        Assert.assertEquals("Java", Task52.solution("avaJ"));
        Assert.assertEquals("ohW", Task52.solution("Who"));
    }
}