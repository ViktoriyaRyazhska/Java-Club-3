import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicProgramsTest {
    BasicPrograms a  = new BasicPrograms();
    @Test
    void getTitle() {
        assertEquals("Basic programs", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new YouCantCodeUnderPressureNo1().getTitle(), a.getKata(1).getTitle());
        assertEquals(new JennysSecretMessage().getTitle(), a.getKata(2).getTitle());
        assertEquals(new ReturnNegative().getTitle(), a.getKata(3).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertTrue(a.isNumberOfKataCorrect(a.getBasicProgramsKatasSize()-1));
        assertTrue(a.isNumberOfKataCorrect(a.getBasicProgramsKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getBasicProgramsKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getBasicProgramsKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getBasicProgramsKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(3, a.getBasicProgramsKatasSize());
        assertFalse( 2== a.getBasicProgramsKatasSize());
        assertFalse( 4== a.getBasicProgramsKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) You can't code under pressure #1; \n "+
                "2) Jenny's secret message; \n "+
                "3) Return Negative; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
