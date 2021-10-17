package com.club3.java.tests;

import com.club3.java.Classes;
import com.club3.java.utils.Fraction;
import com.club3.java.utils.Dinglemouse;
import com.club3.java.utils.Block;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class ClassesTest {
    private Classes classes = new Classes();

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void add() {
        assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        assertEquals(new Fraction(1, 1), new Fraction(1, 4).add(new Fraction(3, 4)));
        assertEquals(new Fraction(863483, 416760), new Fraction(911, 920).add(new Fraction(980, 906)));
        assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
        assertEquals(new Fraction(1011239, 417585), new Fraction(694, 485).add(new Fraction(853, 861)));
        assertEquals(new Fraction(191737, 20757), new Fraction(982, 111).add(new Fraction(219, 561)));
    }

    @Test
    public void plus100() {
        assertEquals(107, new Dinglemouse().INST.plus100(7));
        assertEquals(123, new Dinglemouse().INST.plus100(23));
        assertEquals(319, new Dinglemouse().INST.plus100(219));
    }

    @Test
    public void BlockTest() {
        for (int i = 1; i < 5; i++) {
            Block block = new Block(new int[]{i, i, i});
            assertEquals(i, block.getWidth());
            assertEquals(i, block.getLength());
            assertEquals(i, block.getHeight());
            assertEquals(i * i * i, block.getVolume());
            assertEquals(6 * (i * i), block.getSurfaceArea());
        }
    }

    @Test
    public void scannerInput_fractionsClass() {
        systemInMock.provideLines("1", "8", "4", "5");
        assertEquals("37/40", String.valueOf(classes.fractionsClass()));
    }

    @Test
    public void scannerInput_dinglemouseClass(){
        systemInMock.provideLines("7");
        assertEquals(107,classes.dinglemouseClass());
        systemInMock.provideLines("23");
        assertEquals(123,classes.dinglemouseClass());
    }

    @Test
    public void scannerInput_blockClass(){
        systemInMock.provideLines("1", "2", "3");
        assertEquals("Block{" +
                "width =" + 1 +
                ", length =" + 2 +
                ", height =" + 3 +
                ", volume =" + 6+
                ", surface area =" + 22 + '}',classes.blockClass());
    }
}
