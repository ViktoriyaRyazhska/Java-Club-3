package urban_andrii;
import java.util.ArrayList;
public class Task36 {
    public int countSheeps() {
        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        int i = 0;
        for (boolean a : booleans) {
            if (a == true) {
                i += 1;
            }
        }
        return i;
    }
}