package impl;

import com.softserve.team1.kata.impl.IsDivisible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsDivisibleTest {
    @Test
    public void test1() {
        Assertions.assertTrue(IsDivisible.isDivisible(12, 4, 3));
    }
    @Test
    public void test2() {
        assertFalse(IsDivisible.isDivisible(3, 3, 4));
    }

}