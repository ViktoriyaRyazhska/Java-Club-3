import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {
    Strings a  = new Strings();
    @Test
    void getTitle() {
        assertEquals("Strings", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new ConvertNumberToString().getTitle(), a.getKata(1).getTitle());
        assertEquals(new FIXMEReplaceAllDots().getTitle(), a.getKata(2).getTitle());
        assertEquals(new FindThePosition().getTitle(), a.getKata(3).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertTrue(a.isNumberOfKataCorrect(a.getStringsSize()-1));
        assertTrue(a.isNumberOfKataCorrect(a.getStringsSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getStringsSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getStringsSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getStringsSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(5, a.getStringsSize());
        assertFalse( 2== a.getStringsSize());
        assertFalse( 4== a.getStringsSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) Convert a Number to a String!; \n "+
                "2) Replace all dots; \n "+
                "3) Find the position!; \n "+
                "4) Abbreviate a Two Word Name; \n "+
                "5) altERnaTIng cAsE <=> ALTerNAtiNG CaSe; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
