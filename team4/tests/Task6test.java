import andrii_yaremko.Task6;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Task6test {
    Task6 task6 = new Task6();
    @Test
    public void to_binary(){
        assertEquals("1010",task6.to_binary(10));
    }
}
