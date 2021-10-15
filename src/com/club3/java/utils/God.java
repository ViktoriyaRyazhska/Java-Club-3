package com.club3.java.utils;

public class God {
    public Human[] create() {
        Human[] people = new Human[2];
        people[0] = new Man();
        people[1] = new Woman();

        return people;
    }
}
