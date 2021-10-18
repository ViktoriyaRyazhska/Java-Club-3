package tests;

import org.junit.Assert;
import org.junit.Test;
import urban_andrii.Task56;

import static org.junit.Assert.*;

public class Task56Test {

    @Test
    public void areYouPlayingBanjo() {
        Assert.assertEquals("Roland plays banjo", Task56.areYouPlayingBanjo("Roland"));
        Assert.assertEquals("Den does not play banjo", Task56.areYouPlayingBanjo("Den"));
        Assert.assertEquals("rivaldo plays banjo", Task56.areYouPlayingBanjo("rivaldo"));
        Assert.assertEquals("Max does not play banjo", Task56.areYouPlayingBanjo("Max"));
    }
}