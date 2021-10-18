import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbbreviateTwoWordNameTest {
    AbbreviateTwoWordName a = new AbbreviateTwoWordName();
    @Test
    void getTitle() {
        assertEquals("Abbreviate a Two Word Name", a.getTitle());
    }
    @Test
    void abbrevName() {
        assertEquals("J.S.", a.abbrevName("John Smith"));
        assertEquals("A.B.", a.abbrevName("Andrew Bond"));
        assertEquals("A.", a.abbrevName("Andrew"));
        assertEquals("J.J.S.", a.abbrevName("John Junior Smith"));
    }
    @Test
    void main() {
            assertEquals("J.S.", a.main("John Smith"));
        assertEquals("A.B.", a.main("Andrew Bond"));
        assertEquals("A.", a.main("Andrew"));
        assertEquals("J.J.S.", a.main("John Junior Smith"));
    }
    @Test
    void getDetails() {
        assertEquals(" Type 'e' to close this kata \n" +
                "Details:\n" +
                " This kata  takes a two word name and converts into initials. \n" +
                "\nEnter your name(names full of numbers are forbidden): ", a.getDetails());
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
        assertFalse(a.isValueCorrect("856"));
        assertFalse(a.isValueCorrect("-856"));
        assertFalse(a.isValueCorrect("e"));
        assertFalse(a.isValueCorrect("E"));
        assertTrue(a.isValueCorrect("fa16"));
        assertTrue(a.isValueCorrect("155om"));
        assertFalse(a.isInteger(null));
        assertFalse(a.isInteger("1.5"));
    }
}
