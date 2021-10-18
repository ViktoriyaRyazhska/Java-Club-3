import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassesTest {
    Classes a = new Classes();
    @Test
    void getTitle() {
        assertEquals("Classes", a.getTitle());
    }
    @Test
    void getKata() {
        assertEquals(new FIXMEStaticElectrickery().getTitle(), a.getKata(1).getTitle());
    }
    @Test
    void isNumberOfKataCorrect(){
        assertFalse(a.isNumberOfKataCorrect(a.getClassesKatasSize()-1));
        assertFalse(a.isNumberOfKataCorrect(a.getClassesKatasSize()-2));
        assertTrue(a.isNumberOfKataCorrect(a.getClassesKatasSize()));
        assertFalse(a.isNumberOfKataCorrect(a.getClassesKatasSize()+1));
        assertFalse(a.isNumberOfKataCorrect(a.getClassesKatasSize()+2));
    }
    @Test
    void getBasicProgramsKatasSize(){
        assertEquals(1, a.getClassesKatasSize());
        assertFalse( 2== a.getClassesKatasSize());
        assertFalse( 4== a.getClassesKatasSize());
    }
    @Test
    void getKatas(){
        assertEquals("Choose a kata: \n "+
                "1) Static electrickery; \n "+
                " 'e' - Exit this group of katas;", a.getKatas());
    }
}
