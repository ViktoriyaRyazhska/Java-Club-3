import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FIXMEStaticElectrickeryTest {
    FIXMEStaticElectrickery a = new FIXMEStaticElectrickery();
    @Test
    void getTitle(){
        assertEquals("Static electrickery", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes an integer and returns it incremented by 100. \n" +
                "Enter an integer:  ", a.getDetails());
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
        assertEquals("100", a.main("0"));
        assertEquals("120", a.main("20"));
        assertEquals("-5", a.main("-105"));
    }
    @Test
    void plus100(){
        assertEquals(100, a.plus100(0));
        assertEquals(120, a.plus100(20));
        assertEquals(-5, a.plus100(-105));
    }
    @Test
    void isValueCorrect() {
        assertTrue(a.isValueCorrect("8"));
        assertTrue(a.isValueCorrect("-6"));
        assertFalse(a.isValueCorrect("bs"));
        assertFalse(a.isValueCorrect("1,5"));
        assertTrue(a.isValueCorrect("12"));
        assertFalse(a.isInteger("1.5"));
    }
}
