import andrii_yaremko.Task3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;

public class Task3test {
    Task3 task3 = new Task3();
    @Test
    public void getVolumeOfCubiod() throws UnsupportedEncodingException {

        String input = "1\n 2\n 3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);


        task3.getVolumeOfCubiod();
        String output = os.toString("UTF8");
        Scanner scanner = new Scanner(output);
        scanner.nextLine();
        String x = scanner.nextLine();
        assertEquals("6.0",x);
    }
}
