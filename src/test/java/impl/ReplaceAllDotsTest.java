package impl;

import com.softserve.team1.kata.impl.ReplaceAllDots;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceAllDotsTest {
    @Test
    public void testSomeDots() {
        Assertions.assertEquals("one-two-three", ReplaceAllDots.replaceDots("one.two.three"), "Sorry, try again :-(");
    }

}