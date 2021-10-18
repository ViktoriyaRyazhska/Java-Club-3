import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FIXMEReplaceAllDotsTest {
    FIXMEReplaceAllDots a = new FIXMEReplaceAllDots();
    @Test
    void getTitle(){
        assertEquals("Replace all dots", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes a string and  replaces all the dots '.'  with dashes '-'. \n" +
                " If there is no dots in a string, it returns the string without changes \n" +
                "Enter your string: ", a.getDetails());
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
        assertTrue(a.isValueCorrect("a32"));
        assertTrue(a.isValueCorrect("bs"));
        assertTrue(a.isValueCorrect("b34b"));
        assertTrue(a.isValueCorrect("1.uthd"));
        assertTrue(a.isValueCorrect("1.2"));
        assertTrue(a.isValueCorrect("e.2"));
        assertFalse(a.isValueCorrect("e"));
        assertFalse(a.isValueCorrect("E"));
    }
    @Test
    void replaceDots() {
        assertEquals("e-e-e", a.replaceDots("e.e.e"));
        assertEquals("e-2-1-e-f", a.replaceDots("e.2.1.e.f"));
    }
    @Test
    void main() {
        assertEquals("e-e-e", a.main("e.e.e"));
        assertEquals("e-2-1-e-f", a.main("e.2.1.e.f"));
    }
}
