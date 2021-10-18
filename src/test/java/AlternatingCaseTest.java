import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlternatingCaseTest {
    AlternatingCase a = new AlternatingCase();
    @Test
    void getTitle() {
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", a.getTitle());
    }
    @Test
    void toAlternativeString() {
       assertEquals("hello world", a.toAlternativeString("HELLO WORLD"));
       assertEquals("HELLO WORLD", a.toAlternativeString("hello world"));
       assertEquals("hello WORLD", a.toAlternativeString("HELLO world"));
       assertEquals("HeLLo WoRLD", a.toAlternativeString("hEllO wOrld"));
       assertEquals("12345", a.toAlternativeString("12345"));
       assertEquals("1a2b3c4d5e", a.toAlternativeString("1A2B3C4D5E"));
       assertEquals("String.prototype.toAlternatingCase", a.toAlternativeString("sTRING.PROTOTYPE.TOaLTERNATINGcASE"));

    }
    @Test
    void main() {
        assertEquals("hello world", a.main("HELLO WORLD"));
        assertEquals("HELLO WORLD", a.main("hello world"));
        assertEquals("hello WORLD", a.main("HELLO world"));
        assertEquals("HeLLo WoRLD", a.main("hEllO wOrld"));
        assertEquals("12345", a.main("12345"));
        assertEquals("1a2b3c4d5e", a.main("1A2B3C4D5E"));
        assertEquals("String.prototype.toAlternatingCase", a.main("sTRING.PROTOTYPE.TOaLTERNATINGcASE"));
    }
    @Test
    void getDetails() {
        assertEquals(" Type 'e' to close this kata. \n" +
                "Details: \n" +
                " This kata takes a string and returns a string where \n" +
                " each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. \n" +
                "Enter s string ( non-alphabetical characters are unaffected): ", a.getDetails());
    }
    @Test
    void isInteger() {
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
        assertTrue(a.isValueCorrect("Adrew"));
        assertTrue(a.isValueCorrect("David"));
        assertTrue(a.isValueCorrect("856"));
        assertTrue(a.isValueCorrect("-856"));
        assertFalse(a.isValueCorrect("e"));
        assertFalse(a.isValueCorrect("E"));
        assertTrue(a.isValueCorrect("fa16"));
        assertTrue(a.isValueCorrect("155om"));
        assertFalse(a.isValueCorrect(null));
    }
}
