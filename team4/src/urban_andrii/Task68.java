package urban_andrii;

public class Task68 {
    public static String remove(String s, int n) {
        while (n-- > 0)
            s = s.replaceFirst("!", "");
        return s;
    }
}
