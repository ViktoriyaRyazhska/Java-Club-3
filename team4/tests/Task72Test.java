package tests;

import org.junit.Test;
import urban_andrii.Task72;

import static org.junit.Assert.*;

public class Task72Test {
    Task72 task72 = new Task72();
    @Test
    public void look() {
        task72.newEntry("Banana","A fruit");
        assertEquals("A fruit", task72.look("Banana"));
        task72.newEntry("Basketball","A sport");
        assertEquals("A sport", task72.look("Basketball"));
        task72.newEntry("apple","a fruit");
        assertEquals("a fruit", task72.look("apple"));
        assertEquals("Cant find entry for hello", task72.look("hello"));
        assertEquals("Cant find entry for java", task72.look("java"));
    }
}