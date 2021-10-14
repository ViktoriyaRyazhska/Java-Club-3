package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;
import com.softserve.team1.models.LombokEncapsulation;

public class LombokEncapsulationKata extends BaseKata {

    @Override
    public void test() {
        System.out.println("Enter number value: ");
        int number = (int)readInput(InputType.INT);
        System.out.println("Enter string value ");
        String string = (String)readInput(InputType.STRING);
        System.out.println("Enter any string value ");
        String stringObj = (String)readInput(InputType.STRING);
        LombokEncapsulation lombokEncapsulation = new LombokEncapsulation(number,string,stringObj);
        System.out.println("Created object : " + lombokEncapsulation);
    }
}
