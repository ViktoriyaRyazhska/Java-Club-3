package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class JennysSecretMessage extends BaseKata{

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    @Override
    public void test() {
        Assert.assertEquals("Hello, Jim!", JennysSecretMessage.greet("Jim"));
        Assert.assertEquals("Hello, Jane!", JennysSecretMessage.greet("Jane"));
        Assert.assertEquals("Hello, Simon!", JennysSecretMessage.greet("Simon"));
        Assert.assertEquals("Hello, my love!", JennysSecretMessage.greet("Johnny"));
    }
}
