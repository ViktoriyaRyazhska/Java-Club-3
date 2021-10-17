package andrii_yaremko;

import java.util.Arrays;
import java.util.Scanner;

public class Task45 {
    public void gap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gap");
        int g = scanner.nextInt();
        System.out.println("Enter start number");
        long m = scanner.nextLong();
        System.out.println("Enter finish number");
        long n = scanner.nextLong();
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    long[] gapp = new long[]{last, i};
                    System.out.println(Arrays.toString(gapp));
                    break;
                }
                last = i;
            }
        }
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }

        return true;
    }
}

