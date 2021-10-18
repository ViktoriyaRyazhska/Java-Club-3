package com.softserve.team1.kata.impl;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class PushAHashAnObjectIntoArray extends BaseKata{

    public static List<String> push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }


    @Override
    public void test() {
        List<String> items =  PushAHashAnObjectIntoArray.push();
        Assert.assertEquals(1,items.size());
        Assert.assertEquals("an object", items.get(0));
    }
}
