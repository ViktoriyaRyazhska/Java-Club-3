import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertNumberToStringTest {
    ConvertNumberToString a = new ConvertNumberToString();
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes a number and converts it into a string. \n" +
                "Enter your number: ", a.getDetails());
    }
    @Test
    void getTitle(){
        assertEquals("Convert a Number to a String!", a.getTitle());
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
    void isValueCorrect(){
        assertTrue(a.isValueCorrect("4"));
        assertTrue(a.isValueCorrect("73"));
        assertTrue(a.isValueCorrect("-25"));
        assertFalse(a.isValueCorrect(""));
        assertFalse(a.isValueCorrect(" "));
        assertFalse(a.isValueCorrect("s"));
        assertFalse(a.isValueCorrect("E"));
        assertFalse(a.isValueCorrect("e"));
        assertFalse(a.isValueCorrect(null));
        assertFalse(a.isValueCorrect("11saf"));
        assertFalse(a.isInteger("1.5"));
    }
    @Test
    void numberToString(){
        assertEquals("123" , a.numberToString(123));
        assertEquals("74", a.numberToString(74));
        assertEquals("-123", a.numberToString(-123));
    }
    @Test
    void main(){
        assertEquals("123" , a.main("123"));
        assertEquals("123", a.main("123"));
        assertEquals("-123", a.main("-123"));
    }
}
