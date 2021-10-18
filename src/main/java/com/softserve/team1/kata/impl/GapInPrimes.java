package com.softserve.team1.kata.impl;

import org.testng.Assert;
import java.util.Arrays;

public class GapInPrimes extends BaseKata {

    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    System.out.println(i);
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    @Override
    public void test() {
        Assert.assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2, 100, 110)));
        Assert.assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4, 100, 110)));
        Assert.assertEquals(null, GapInPrimes.gap(6, 100, 110));
        Assert.assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8, 300, 400)));
        Assert.assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10, 300, 400)));

    }
}
