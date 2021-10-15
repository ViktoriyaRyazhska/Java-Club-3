package impl;

import com.softserve.team1.kata.impl.BeginnerSeriesNumber2Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerSeriesNumber2ClockTest {
    @Test
    public void test1(){

        Assertions.assertEquals(61000, BeginnerSeriesNumber2Clock.Past(0,1,1));
    }


}