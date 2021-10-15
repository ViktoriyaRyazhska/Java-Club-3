package com.club3.java.tests;

import com.club3.java.BasicProgram;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class BasicProgramTest {
    private com.club3.java.impl.BasicProgramImpl basicProgram = new com.club3.java.impl.BasicProgramImpl();
    private BasicProgram basicProgram1 = new BasicProgram();

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void getVolumeOfCuboid3() {
        assertEquals(12, basicProgram.getVolumeOfCuboid3(3, 4, 1), 0.1);
    }

    @Test
    public void past7() {
        assertEquals(3661000, basicProgram.past7(1, 1, 1));
    }

    @Test
    public void weatherInfo11() {
        assertEquals("10.0 is above freezing temperature", basicProgram.weatherInfo11(50));
        assertEquals("-12.222222222222223 is freezing temperature", basicProgram.weatherInfo11(10));
    }

    @Test
    public void multiplyTwoNumbers() {
        assertEquals(12, basicProgram.multiplyTwoNumbers(3, 4));
        assertEquals(24, basicProgram.multiplyTwoNumbers(12, 2));
        assertEquals(50, basicProgram.multiplyTwoNumbers(10, 5));
    }

    @Test
    public void integerToBinary() {
        assertEquals(1100100, basicProgram.integerToBinary(100));
        assertEquals(1, basicProgram.integerToBinary(1));
        assertEquals(10, basicProgram.integerToBinary(2));
        assertEquals(11, basicProgram.integerToBinary(3));
        assertEquals(101, basicProgram.integerToBinary(5));

    }

    @Test
    public void ageRangeCompatibilityEquation() {
        assertEquals("15-20", basicProgram.ageRangeCompatibilityEquation(17));
        assertEquals("27-66", basicProgram.ageRangeCompatibilityEquation(40));
        assertEquals("14-16", basicProgram.ageRangeCompatibilityEquation(15));
        assertEquals("24-56", basicProgram.ageRangeCompatibilityEquation(35));
        assertEquals("9-11", basicProgram.ageRangeCompatibilityEquation(10));
    }

    @Test
    public void doubleInteger() {
        assertEquals(4, basicProgram.doubleInteger(2));
        assertEquals(100, basicProgram.doubleInteger(50));
        assertEquals(8, basicProgram.doubleInteger(4));
        assertEquals(2, basicProgram.doubleInteger(1));
        assertEquals(0, basicProgram.doubleInteger(0));
    }

    @Test
    public void greet() {
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", basicProgram.greet("Johnny"));
        assertEquals("should greet some people normally", "Hello, Jim!", basicProgram.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", basicProgram.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", basicProgram.greet("Simon"));
    }

    @Test
    public void makeNegative() {
        assertEquals(-7, basicProgram.makeNegative(-7));
        assertEquals(-42, basicProgram.makeNegative(42));
        assertEquals(-1, basicProgram.makeNegative(-1));
        assertEquals(-1, basicProgram.makeNegative(1));
    }

    @Test
    public void scannerInput_multiplyTwoNumbers() {
        systemInMock.provideLines("3", "4");
        assertEquals(12, basicProgram1.multiplyTwoNumbers());
    }

    @Test
    public void scannerInput_integerToBinary() {
        systemInMock.provideLines("100");
        assertEquals(1100100, basicProgram1.integerToBinary());
    }

    @Test
    public void scannerInput_ageRangeCompatibilityEquation() {
        systemInMock.provideLines("35");
        assertEquals("24-56", basicProgram1.ageRangeCompatibilityEquation());
    }
}
