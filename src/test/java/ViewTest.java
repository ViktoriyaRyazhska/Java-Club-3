import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ViewTest {
    View a = new View();
    @Test
    void show(){
        getInstruction();
        isInteger();
        isNumberOfGroupCorrect();
    }
    @Test
    void getInstruction() {
        assertEquals("Choose a group of katas: \n" +
                "  1) Basic programs; \n" +
                "  2) Classes; \n" +
                "  3) Conditions; \n" +
                "  4) Loops; \n" +
                "  5) OOP; \n" +
                "  6) Strings; \n" +
                "  7) Collections; \n  ", a.getInstruction());
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
    void isNumberOfGroupCorrect() {
        assertTrue(a.isNumberOfGroupCorrect("4"));
        assertTrue(a.isNumberOfGroupCorrect("7"));
        assertTrue(a.isNumberOfGroupCorrect("1"));
        assertFalse(a.isNumberOfGroupCorrect("8"));
        assertFalse(a.isNumberOfGroupCorrect("0"));
    }
}
