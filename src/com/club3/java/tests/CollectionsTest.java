package com.club3.java.tests;

import com.club3.java.Collections;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class CollectionsTest {
    private Collections collections = new Collections();

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void getVolumeOfCuboid3() {
        systemInMock.provideLines("1","2","3");
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3));
        assertEquals(expectedResult, collections.filterOddNumber71());
    }
}
