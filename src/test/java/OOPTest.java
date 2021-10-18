import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OOPTest {
    OOP a  = new OOP();
    @Test
    void getTitle() {
        assertEquals("OOP", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(null, a.getKata(0));
    }
    @Test
    void isNumberOfKataCorrect(){
        assertFalse(a.isNumberOfKataCorrect(a.getOOPKatasSize()-1));
        assertFalse(a.isNumberOfKataCorrect(a.getOOPKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getOOPKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getOOPKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getOOPKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(1, a.getOOPKatasSize());
        assertFalse( 2== a.getOOPKatasSize());
        assertFalse( 4== a.getOOPKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "0) ; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
