package com.club3.java.utils;

import com.club3.java.OOP;

public class God {
    public Human[] create() {
        Human[] people = new Human[2];
        people[0] = new Man();
        people[1] = new Woman();

        return people;
    }
}
