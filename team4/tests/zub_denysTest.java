import andrii_yaremko.*;
import zub_denys.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class zub_denysTest {
    @Test
    public void isDivisible() {
        Divisible divisible = new Divisible();
        assertEquals(true, divisible.isDivisible(4, 2, 2));
        assertEquals(false, divisible.isDivisible(4, 5, 2));
    }

    GoodReally goodReally = new GoodReally();

    @Test
    public void betterThanAverage() {
        assertEquals(true, goodReally.betterThanAverage(new int[]{4, 5, 6}, 14));
    }

    Grasshopper grasshopper = new Grasshopper();

    @Test
    public void weatherInfo() {
        assertEquals("0.0 is above freezing temperature", grasshopper.weatherInfo(32));
        assertEquals("10.0 is above freezing temperature", grasshopper.weatherInfo(50));
    }

    OppositeNumber oppositeNumber = new OppositeNumber();

    @Test
    public void opposite() {
        assertEquals(8, oppositeNumber.opposite(-8));
    }

    Sticks sticks = new Sticks();

    @Test
    public void makeMove() {
        assertEquals(2, sticks.makeMove(10));
    }

    TrafficLights trafficLights = new TrafficLights();

    @Test
    public void updateLight() {
        assertEquals("yellow", trafficLights.updateLight("green"));
        assertEquals("red", trafficLights.updateLight("yellow"));
        assertEquals("green", trafficLights.updateLight("red"));
    }

    TripleDouble tripleDouble = new TripleDouble();

    @Test
    public void tripleTrouble() {
        assertEquals("rtjeooxmb", tripleDouble.tripleTrouble("rex", "tom", "job"));
    }

    TwiceAsOld twiceAsOld = new TwiceAsOld();

    @Test
    public void twiceAsOlds() {
        assertEquals(20, twiceAsOld.TwiceAsOlds(40, 30));
        assertEquals(20, twiceAsOld.TwiceAsOlds(80, 30));
    }

    Avarage avarage = new Avarage();

    @Test
    public void getAvarage() {
        assertEquals(4, avarage.getAvarage(new int[]{4, 5, 4, 3, 6, 2}));
    }
    YesOrNo yesOrNo = new YesOrNo();
    @Test
    public void wordBoolean() {
        assertEquals(true,yesOrNo.boolToWord(true));
        assertEquals(false,yesOrNo.boolToWord(false));
    }
}
