package impl;

import com.softserve.team1.kata.impl.OppositesAttract;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class OppositesAttractTest {

    @Test
    void isLove() {
    }

    @Test
    void test1() {
    }
    @Test
    public void testOddAndEven() {
        Assert.assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        Assert.assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        Assert.assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        Assert.assertEquals(true, OppositesAttract.isLove(0, 1));
    }
}