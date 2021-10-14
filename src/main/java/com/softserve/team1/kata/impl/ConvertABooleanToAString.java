package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class ConvertABooleanToAString extends BaseKata{
    public static String convert(boolean b){
        return Boolean.toString(b);
    }

    @Override
    public void test() {
        System.out.println("Enter boolean value to convert : ");
        Boolean inputString = (Boolean) readInput(InputType.BOOLEAN);
        System.out.println("Converted to a string :" + convert(inputString));
    }
}
