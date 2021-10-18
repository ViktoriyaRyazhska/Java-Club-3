import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionsTest {
    Conditions a  = new Conditions();
    @Test
    void getTitle() {
        assertEquals("Conditions", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new DoIgetAbonus().getTitle(), a.getKata(1).getTitle());
        assertEquals(new OppositesAttract().getTitle(), a.getKata(2).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertTrue(a.isNumberOfKataCorrect(a.getConditionsKatasKatasSize()-1));
        assertFalse(a.isNumberOfKataCorrect(a.getConditionsKatasKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getConditionsKatasKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getConditionsKatasKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getConditionsKatasKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(2, a.getConditionsKatasKatasSize());
        assertTrue( 2== a.getConditionsKatasKatasSize());
        assertFalse( 4== a.getConditionsKatasKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) Do I get a bonus?; \n "+
                "2) Opposites Attract; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
