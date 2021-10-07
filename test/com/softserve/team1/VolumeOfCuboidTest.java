package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfCuboidTest {

    private final double delta = 0.0001;

    @Test
    public void volumeOfCuboidTest() {
        // assertEquals("expected", "actual");
        assertEquals(4, VolumeOfCuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfCuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}