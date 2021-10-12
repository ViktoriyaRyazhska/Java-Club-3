package com.softserve.team1;

public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %1$s! Welcome to %2$s, %3$s!", String.join(" ", name), city, state);
    }
}
