package com.softserve.team3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public Dictionary() {

    }

    public void newEntry(String key, String value) {
        dictionary.put(key, value);
    }

    public String look(String key) {
        return dictionary.containsKey(key) ? dictionary.get(key) : "Cant find entry for " + key;
    }
}