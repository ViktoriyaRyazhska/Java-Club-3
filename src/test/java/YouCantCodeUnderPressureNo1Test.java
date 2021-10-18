import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YouCantCodeUnderPressureNo1Test {
    YouCantCodeUnderPressureNo1 y = new YouCantCodeUnderPressureNo1();
    @Test
    void getTitle() {
        assertEquals("You can't code under pressure #1", y.getTitle());
    }
    @Test
    void doubleInteger() {
        assertEquals(4, y.doubleInteger(2));
    }

    @Test
    void getDetails() {
        assertEquals(" Type 'e' to close this kata \n " +
                "Details:\n" +
                " This kata reeds an integer number, doubles and returns it.\n" +
                "\n Enter an integer number: ", y.getDetails());
    }
    @Test
    void isInteger(){
        assertTrue(y.isInteger("4"));
        assertTrue(y.isInteger("73"));
        assertTrue(y.isInteger("-25"));
        assertFalse(y.isInteger(""));
        assertFalse(y.isInteger(" "));
        assertFalse(y.isInteger("s"));
        assertFalse(y.isInteger("11saf"));
        assertFalse(y.isInteger(null));
        assertFalse(y.isInteger("1.5"));
    }
    @Test
    void isValueCorrect(){
        assertTrue(y.isValueCorrect("4"));
        assertTrue(y.isValueCorrect("73"));
        assertTrue(y.isValueCorrect("-25"));
        assertFalse(y.isValueCorrect(""));
        assertFalse(y.isValueCorrect(" "));
        assertFalse(y.isValueCorrect("s"));
        assertFalse(y.isValueCorrect("E"));
        assertFalse(y.isValueCorrect("e"));
        assertFalse(y.isValueCorrect(null));
        assertFalse(y.isValueCorrect("11saf"));
        assertFalse(y.isInteger("1.5"));
    }
    @Test
    void main(){
        assertEquals("4", y.main("2"));
        assertEquals("-4", y.main("-2"));
        assertEquals("84", y.main("42"));
    }

}