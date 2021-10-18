import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringRepeatTest {
    StringRepeat a = new StringRepeat();
    @Test
    void getTitle(){
        assertEquals("String repeat", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals( "Type 'e' to close this kata \n" +
                " This kata takes an integer 'n' and string and returns the string repated n times \n" +
                "Enter an integer and a string:", a.getDetails());
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
        assertTrue(a.isValueCorrect("1, gag"));
        assertTrue(a.isValueCorrect("gag, 1"));
        assertFalse(a.isValueCorrect("q"));
        assertFalse(a.isValueCorrect("2"));
        assertTrue(a.isValueCorrect("2 23"));
    }
    @Test
    void main(){
        assertEquals("44", a.main("2, 4"));
        assertEquals("a", a.main("1, a"));
        assertEquals("5a5a5a", a.main("3 5a"));
    }
    @Test
    void repeatStr(){
        assertEquals("44", a.repeatStr(2, "4"));
        assertEquals("a", a.repeatStr(1, "a"));
        assertEquals("5a5a5a", a.repeatStr(3 ,"5a"));
    }
}
