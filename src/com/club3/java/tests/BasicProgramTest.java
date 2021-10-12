package com.club3.java.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicProgramTest {
    com.club3.java.impl.BasicProgramImpl basicProgram = new com.club3.java.impl.BasicProgramImpl();

    @Test
    public void getVolumeOfCuboid3()
    {

        assertEquals(12,basicProgram.getVolumeOfCuboid3(3,4,1),0.1);
    }
    @Test
    public void past7()
    {
        assertEquals(3661000,basicProgram.past7(1,1,1));
    }
    @Test
    public void weatherInfo11()
    {
        assertEquals("10.0 is above freezing temperature",basicProgram.weatherInfo11(50));
        assertEquals("-12.222222222222223 is freezing temperature",basicProgram.weatherInfo11(10));
    }
    @Test
    public void multiplyTwoNumbers() {

        assertEquals(12,basicProgram.multiplyTwoNumbers(3,4));
    }
}
