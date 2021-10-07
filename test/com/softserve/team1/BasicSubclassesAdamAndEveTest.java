package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicSubclassesAdamAndEveTest {

    @Test
    public void makingAdam(){
        Human[] paradise = BasicSubclassesAdamAndEve.create();
        assertTrue(paradise[0] instanceof Man);
    }
}