package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.impl.PushAHashAnObjectIntoArray;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PushAHashAnObjectIntoArrayTest {

    @Test
    void push() {
    }

    @Test
    void test1() {
        List<String> items =  PushAHashAnObjectIntoArray.push();
        Assert.assertEquals(1,items.size());
        Assert.assertEquals("an object", items.get(0));
    }
}