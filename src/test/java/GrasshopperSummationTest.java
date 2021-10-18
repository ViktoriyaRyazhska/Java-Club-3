import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrasshopperSummationTest {
    GrasshopperSummation a =new GrasshopperSummation();
    @Test
    void getTitle(){
        assertEquals("Grasshopper - Summation", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals( "Type 'e' to close this kata \n" +
                " This kata takes an integer 'n' that is greater than 0 \n" +
                " and returns the summation of every number from 1 to n . \n " +
                " The number will always be a positive integer greater than 0. \n" +
                "Enter an integer 'n': ", a.getDetails());
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
    void main(){
        assertEquals("6", a.main("3"));
        assertEquals("1", a.main("1"));
        assertEquals("3", a.main("2"));
    }
    @Test
    void summation(){
        assertEquals(6, a.summation(3));
        assertEquals(1, a.summation(1));
        assertEquals(3, a.summation(2));
    }
    @Test
    void isValueCorrect() {
        assertTrue(a.isValueCorrect("8"));
        assertFalse(a.isValueCorrect("-6"));
        assertFalse(a.isValueCorrect("bs"));
        assertFalse(a.isValueCorrect("1,5"));
        assertTrue(a.isValueCorrect("12"));
        assertFalse(a.isValueCorrect("0"));
    }
}
