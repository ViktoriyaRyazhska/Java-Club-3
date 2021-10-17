package andrii_yaremko;

import java.util.Scanner;

public class Task49 {
    public String encode(String source) {
        if (source == null || source == "") {
            System.out.println(" ");
        }
        source = source.replaceAll("(?i)a", "4");
        source = source.replaceAll("(?i)e", "3");
        source = source.replaceAll("(?i)l", "1");
        source = source.replaceAll("(?i)m", "/^^\\\\");
        source = source.replaceAll("(?i)o", "0");
        source = source.replaceAll("(?i)u", "(_)");
        System.out.println(source);
        return source;
    }

}

abstract class Encoder {
    public abstract String encode(String source);
}
