import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FilteringEvenNumbersTest {
    FilteringEvenNumbers a = new FilteringEvenNumbers();
    @Test
    void getTitle(){
        assertEquals("Filtering even numbers", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata \n" +
                "Details: \n" +
                " The kata removes even numbers from the list and returns a list that contains the odd numbers. \n" +
                "Enter a list of integers(it is forbidden to enter letters or strings except 'e'): ", a.getDetails());
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
    void filterOddNumber(){
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7);
        List<Integer> expectedResult = Arrays.asList(1, 3, 5, 7);
        assertEquals(expectedResult, a.filterOddNumber(listOfNumbers));
    }
    @Test
    void main(){
        String s = "1, 2, 2, 2, 4, 3, 4, 5, 6, 7";
        List<Integer> expectedResult = Arrays.asList(1, 3, 5, 7);
        String res = "";
        for(Integer x: expectedResult){
            res += String.valueOf(x) + " ";
        }
        assertEquals(res, a.main(s));
    }
    @Test
    void isValueCorrect(){
        assertTrue(a.isValueCorrect("1, 2, 2, 2, 4, 3, 4, 5, 6, 7"));
        assertTrue(a.isValueCorrect("1 2 2 2 4 3 4 5 6 7"));
        assertTrue(a.isValueCorrect("1 2, 2 2 4, 3 4 5, 6 7"));
        assertFalse(a.isValueCorrect("1 e, 2 2 4, 3 4 5, 6 7"));
        assertFalse(a.isValueCorrect("1 2 2 2 4 3 t 5 6 7"));
        assertFalse(a.isValueCorrect("1, 2, 2, t, 4, 3, 4, 5, 6, 7"));
        assertFalse(a.isValueCorrect("1f, 2, 2g, 2, 4, 3, 4, 5, 6, 7"));
        assertFalse(a.isValueCorrect("1.5, 2, 2, 2, 4, 3, 4, 5, 6, 7"));
    }
}
