import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindThePositionTest {
    FindThePosition a = new FindThePosition();
    @Test
    void getTitle(){
        assertEquals("Find the position!", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata  takes a letter and returns its position in the alphabet. \n" +
                "Enter your name(names full of numbers are forbidden):  ", a.getDetails());
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
        assertEquals("Position of alphabet: 1", a.main("a"));
        assertEquals("Position of alphabet: 2", a.main("b"));
        assertEquals("Position of alphabet: 3", a.main("c"));
    }
    @Test
    void position(){
        assertEquals("Position of alphabet: 1", a.position('a'));
        assertEquals("Position of alphabet: 2", a.position('b'));
        assertEquals("Position of alphabet: 3", a.position('c'));
    }
    @Test
    void isValueCorrect() {
       assertTrue(a.isValueCorrect("a"));
       assertTrue(a.isValueCorrect("b"));
       assertFalse(a.isValueCorrect("bs"));
       assertFalse(a.isValueCorrect("1"));
       assertFalse(a.isValueCorrect("12"));
    }
}
