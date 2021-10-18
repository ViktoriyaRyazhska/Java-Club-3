import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountingSheepTest {
    CountingSheep a = new CountingSheep();
    @Test
    void getTitle(){
        assertEquals("Counting sheep...", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                " Consider an list of sheep where some sheep may be missing from their place. \n" +
                " This kata counts the number of sheep present in the array (true means present). \n" +
                "Enter a list of true( = present) or false( = not present) values \n" +
                "(it is forbidden to enter letters or numbers except 'e'): ", a.getDetails());
    }
    @Test
    void isValueCorrect(){
        assertTrue(a.isValueCorrect("true,  true,  true,  false"));
        assertTrue(a.isValueCorrect("true,  true,  true  false"));
        assertTrue(a.isValueCorrect("true  true  true  false"));
        assertFalse(a.isValueCorrect("true  true 1 true  false"));
    }
    @Test
    void main(){
        assertEquals("3",a.main("true,  true,  true,  false"));
        assertEquals("3" ,a.main("true,  true,  true  false"));
        assertEquals("3" ,a.main("true  true  true  false"));
        assertEquals("2" ,a.main("true     true  false"));
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
}
