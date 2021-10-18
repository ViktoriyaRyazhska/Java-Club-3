package andrii_yaremko;

import java.util.Arrays;
import java.util.Scanner;

public class Task45 {
    public String gap(int g,long m,long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    long[] gapp = new long[]{last, i};
                    System.out.println(Arrays.toString(gapp));
                    return Arrays.toString(gapp);
                }
                last = i;
            }
        }
        return "Fasle";
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }

        return true;
    }
}

