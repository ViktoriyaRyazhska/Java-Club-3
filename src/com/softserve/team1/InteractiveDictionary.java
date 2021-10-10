package com.softserve.team1;
import java.util.HashMap;

public class InteractiveDictionary{

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
}
