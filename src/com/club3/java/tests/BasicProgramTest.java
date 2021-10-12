package com.club3.java.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicProgramTest {
    com.club3.java.impl.BasicProgramImpl basicProgram = new com.club3.java.impl.BasicProgramImpl();

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
        assertEquals(24, basicProgram.multiplyTwoNumbers(12,2));
        assertEquals(50, basicProgram.multiplyTwoNumbers(10,5));
    }

    @Test
    public void integerToBinary(){
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
}
