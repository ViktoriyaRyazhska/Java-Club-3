import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReturnNegativeTest {
    ReturnNegative a = new ReturnNegative();
    @Test
    void getTitle(){
        assertEquals("Return Negative", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals( "Type 'e' to close this kata \n" +
                " In this simple assignment you give an integer and the program has to make it negative. \n" +
                " If the integer is negative, it is returned without changes \n" +
                "Enter a number(letters are forbidden except 'e'): ", a.getDetails());
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
        assertTrue(a.isValueCorrect("8"));
        assertTrue(a.isValueCorrect("-6"));
        assertFalse(a.isValueCorrect("bs"));
        assertTrue(a.isValueCorrect("1"));
        assertTrue(a.isValueCorrect("12"));
        assertFalse(a.isValueCorrect("O"));
    }
    @Test
    void main(){
        assertEquals("-5", a.main("5"));
        assertEquals("-5", a.main("-5"));
        assertEquals("0", a.main("0"));
    }
    @Test
    void isLove(){
        assertEquals(-5, a.makeNegative(-5));
        assertEquals(-5, a.makeNegative(5));
        assertEquals(0, a.makeNegative(0));
    }

}
