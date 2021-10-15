package impl;

import com.softserve.team1.kata.impl.VolumeOfCuboid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfCuboidTest {
    private static final double delta = 0.0001;

    @Test
    public void examples() {
        Assertions.assertEquals(4, VolumeOfCuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfCuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }

}