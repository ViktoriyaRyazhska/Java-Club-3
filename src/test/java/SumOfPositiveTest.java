import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfPositiveTest {
    SumOfPositive a = new SumOfPositive();
    @Test
    void getTitle(){
        assertEquals("Sum of positive", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals( "Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata  takes a list of integers and returns the sum of all of the positives ones. \n" +
                "Enter integers(it is forbidden to enter letters or strings except 'e'): ", a.getDetails());
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
        assertTrue(a.isValueCorrect("8, 6 "));
        assertTrue(a.isValueCorrect("-6, 8 3"));
        assertFalse(a.isValueCorrect("bs"));
        assertTrue(a.isValueCorrect("1 , 5"));
        assertTrue(a.isValueCorrect("12, 1"));
        assertFalse(a.isValueCorrect("0.0"));
    }
    @Test
    void main(){
        assertEquals("7", a.main("1,4,-5, 2"));
        assertEquals("0", a.main("0 0 0"));
        assertEquals("0", a.main("-2, -8 -5"));
    }
    @Test
    void sum(){
        assertEquals(7, a.sum(Arrays.asList(1,4,-5, 2)));
        assertEquals(0, a.sum(Arrays.asList(0, 0, 0)));
        assertEquals(0, a.sum(Arrays.asList(-2, -8, -5)));
    }
}
