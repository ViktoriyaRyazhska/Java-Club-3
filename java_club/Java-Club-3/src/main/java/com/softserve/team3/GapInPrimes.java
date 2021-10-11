package com.softserve.team3;

import java.util.Arrays;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long prime[] = new long[]{0, 0};
        for (long i = m+(g-1); i <= n; i++) {
            if (isPrime(i)) {
                prime[0] = i;
                long temp = i;
                i += g;
                if (isPrime(i) && i<=n) {
                    prime[1] = i;
                    break;
                }
                i = temp;
            }
        }
        if (prime[0] == 0 ||prime[1] == 0) {
            return null;
        } else
            return prime;
    }

    public static boolean isPrime(long number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (i == number) {
                    if (count <= 2) {
                        return true;
                    }
                    count = 0;
                }
            }
        }
        return false;
    }
}
