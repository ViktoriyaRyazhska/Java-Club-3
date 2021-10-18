package com.softserve.team1.kata.impl;

import org.testng.Assert;

public class RemoveStringSpaces extends BaseKata{

    public static String noSpace(final String x) {
        return x.replaceAll("\\s","");
    }

    @Override
    public void test() {
        Assert.assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        Assert.assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        Assert.assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpace("8aaaaa dddd r     "));
        Assert.assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        Assert.assertEquals("8jaam", RemoveStringSpaces.noSpace("8j aam"));
    }
}
