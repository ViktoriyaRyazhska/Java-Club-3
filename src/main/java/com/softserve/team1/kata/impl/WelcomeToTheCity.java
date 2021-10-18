package com.softserve.team1.kata.impl;

import org.testng.Assert;

public class WelcomeToTheCity extends BaseKata{

    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %1$s! Welcome to %2$s, %3$s!",
                String.join(" ", name), city, state);
    }

    @Override
    public void test() {
        WelcomeToTheCity h = new WelcomeToTheCity();
        String[] name = {"John", "Smith"};
        Assert.assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}
