package com.softserve.team1.kata.impl;

import java.util.HashMap;

public class InteractiveDictionary extends BaseKata{

    private HashMap<String, String> map;
    public InteractiveDictionary() {
        map = new HashMap<>();
    }
    public void newEntry(String key, String value) {
        map.put(key, value);
    }
    public String look(String key) {
        return map.getOrDefault(key, "Cant find entry for " + key);
    }

    @Override
    public void test() {
        System.out.println("Kata Not working NOW... Please cheking for release");
    }
}
