import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopsTest {
    Loops a  = new Loops();
    @Test
    void getTitle() {
        assertEquals("Loops", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new StringRepeat().getTitle(), a.getKata(1).getTitle());
        assertEquals(new CountingSheep().getTitle(), a.getKata(2).getTitle());
        assertEquals(new SumOfPositive().getTitle(), a.getKata(3).getTitle());
        assertEquals(new GrasshopperSummation().getTitle(), a.getKata(4).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertTrue(a.isNumberOfKataCorrect(a.getLoopsKatasKatasSize()-1));
        assertTrue(a.isNumberOfKataCorrect(a.getLoopsKatasKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getLoopsKatasKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getLoopsKatasKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getLoopsKatasKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(4, a.getLoopsKatasKatasSize());
        assertFalse( 2== a.getLoopsKatasKatasSize());
        assertTrue( 4== a.getLoopsKatasKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) String repeat; \n "+
                "2) Counting sheep...; \n "+
                "3) Sum of positive; \n "+
                "4) Grasshopper - Summation; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
