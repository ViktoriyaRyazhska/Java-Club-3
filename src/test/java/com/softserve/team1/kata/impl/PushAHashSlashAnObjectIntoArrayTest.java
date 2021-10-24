package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushAHashSlashAnObjectIntoArrayTest {
    @Test
    void push() {
        List<String> items = PushAHashSlashAnObjectIntoArray.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }

    @Test
    void test1() {
    }
}
