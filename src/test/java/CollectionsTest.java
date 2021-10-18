import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {
    Collections a  = new Collections();
    @Test
    void getTitle() {
        assertEquals("Collections", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new FilteringEvenNumbers().getTitle(), a.getKata(1).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertFalse(a.isNumberOfKataCorrect(a.getCollectionsKatasSize()-1));
        assertFalse(a.isNumberOfKataCorrect(a.getCollectionsKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getCollectionsKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getCollectionsKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getCollectionsKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(1, a.getCollectionsKatasSize());
        assertFalse( 2== a.getCollectionsKatasSize());
        assertFalse( 4== a.getCollectionsKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) Filtering even numbers; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
