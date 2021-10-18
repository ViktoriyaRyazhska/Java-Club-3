import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JennysSecretMessageTest {
    JennysSecretMessage j = new JennysSecretMessage();
    @Test
    void getTitle() {
        assertEquals("Jenny's secret message", j.getTitle());
    }
    @Test
    void greet() {
        assertEquals("Hello, David!", j.greet("David"));
        assertEquals("Hello, my love!", j.greet("Johnny"));
    }
    @Test
    void main() {
        assertEquals("Hello, David!", j.main("David"));
        assertEquals("Hello, my love!", j.main("Johnny"));
    }
    @Test
    void getDetails() {
        assertEquals(" Type 'e' to close this kata. \n" +
                "Details:\n" +
                " Jenny has written a function that returns a greeting for a user. \n " +
                " However, she's in love with Johnny, and would like to greet him slightly different. \n" +
                "Enter your name(names full of numbers are forbidden): ", j.getDetails());
    }
    @Test
    void isInteger() {
        assertTrue(j.isInteger("4"));
        assertTrue(j.isInteger("73"));
        assertTrue(j.isInteger("-25"));
        assertFalse(j.isInteger(""));
        assertFalse(j.isInteger(" "));
        assertFalse(j.isInteger("s"));
        assertFalse(j.isInteger("11saf"));
        assertFalse(j.isInteger("fa16"));

    }
    @Test
    void isValueCorrect() {
        assertTrue(j.isValueCorrect("Adrew"));
        assertTrue(j.isValueCorrect("David"));
        assertFalse(j.isValueCorrect("856"));
        assertFalse(j.isValueCorrect("-856"));
        assertFalse(j.isValueCorrect("e"));
        assertFalse(j.isValueCorrect("E"));
        assertTrue(j.isValueCorrect("fa16"));
        assertTrue(j.isValueCorrect("155om"));
        assertFalse(j.isInteger(null));
    }

}