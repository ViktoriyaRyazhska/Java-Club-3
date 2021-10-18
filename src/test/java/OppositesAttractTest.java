import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OppositesAttractTest {
    OppositesAttract a = new OppositesAttract();
    @Test
    void getTitle(){
        assertEquals("Opposites Attract", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals( " Type 'e' to close this kata \n" +
                "Timmy & Sarah think they are in love, but around where they live, \n" +
                "they will only know once they pick a flower each. \n" +
                "If one of the flowers has an even number of petals and \n" +
                "the other has an odd number of petals it means they are in love.\n" +
                "This kata takes the number of petals of each flower and returns true if they are in love and false if they aren't. \n" +
                " Enter two integers:", a.getDetails());
    }
    @Test
    void isInteger(){
        assertTrue(a.isInteger("4"));
        assertTrue(a.isInteger("73"));
        assertTrue(a.isInteger("-25"));
        assertFalse(a.isInteger(""));
        assertFalse(a.isInteger(" "));
        assertFalse(a.isInteger("s"));
        assertFalse(a.isInteger("11saf"));
        assertFalse(a.isInteger(null));
        assertFalse(a.isInteger("1.5"));
    }
    @Test
    void isValueCorrect() {
        assertTrue(a.isValueCorrect("8, 6"));
        assertFalse(a.isValueCorrect("-6"));
        assertFalse(a.isValueCorrect("bs"));
        assertTrue(a.isValueCorrect("1,5"));
        assertTrue(a.isValueCorrect("12, 1"));
        assertFalse(a.isValueCorrect("0"));
    }
    @Test
    void main(){
        assertEquals("false", a.main("2, 4"));
        assertEquals("true", a.main("1, 4"));
        assertEquals("false", a.main("1 ,3"));
    }
    @Test
    void isLove(){
        assertEquals(false, a.isLove(2, 4));
        assertEquals(true, a.isLove(1, 4));
        assertEquals(false, a.isLove(1 ,3));
    }
}
