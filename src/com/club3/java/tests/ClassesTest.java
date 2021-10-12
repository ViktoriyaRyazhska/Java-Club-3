package com.club3.java.tests;

import com.club3.java.utils.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class ClassesTest {

    @Test
    public void add(){
        Assert.assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        Assert.assertEquals(new Fraction(1, 1), new Fraction(1, 4).add(new Fraction(3, 4)));
        Assert.assertEquals(new Fraction(863483, 416760), new Fraction(911, 920).add(new Fraction(980, 906)));
        Assert.assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        Assert.assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
        Assert.assertEquals(new Fraction(1011239, 417585), new Fraction(694, 485).add(new Fraction(853, 861)));
        Assert.assertEquals(new Fraction(191737, 20757), new Fraction(982, 111).add(new Fraction(219, 561)));
    }
}
