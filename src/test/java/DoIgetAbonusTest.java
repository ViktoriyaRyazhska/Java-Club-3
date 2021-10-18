import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoIgetAbonusTest {
    DoIgetAbonus a = new DoIgetAbonus();
    @Test
    void getTitle(){
        assertEquals("Do I get a bonus?", a.getTitle());
    }
    @Test
    void getDetails(){
        assertEquals(" Type 'e' to close this kata. \n" +
                "It's bonus time in the big city! \n" +
                "The fatcats are rubbing their paws in anticipation... but who is going to make the most money? \n" +
                "This kata takes two arguments: salary and bonus. Salary will be an integer, and bonus a boolean. \n" +
                "If bonus is true, the salary will be multiplied by 10. \n " +
                "If bonus is false, the fatcat did not make enough money and must receive only his stated salary. \n" +
                " Enter salary and bonus(use a whitespace or a comma to split two arguments):", a.getDetails());
    }
    @Test
    void isValueCorrect(){
        assertTrue(a.isValueCorrect("1000, true"));
        assertTrue(a.isValueCorrect("1000, false"));
        assertTrue(a.isValueCorrect("1000 false"));
        assertFalse(a.isValueCorrect("af false"));
        assertFalse(a.isValueCorrect("af, false"));
        assertFalse(a.isValueCorrect("1515 qe"));
        assertFalse(a.isValueCorrect("1515 15"));
        assertFalse(a.isValueCorrect("15.15 1.5"));
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
        assertEquals("£1500", a.main("150, true"));
        assertEquals("£1500", a.main("150 true"));
        assertEquals("£150", a.main("150 false"));
        assertEquals("£150", a.main("150, false"));
    }
    @Test
    void bonusTime(){
        assertEquals("£1500", a.bonusTime(150, true));
        assertEquals("£150", a.bonusTime(150, false));
    }
}
