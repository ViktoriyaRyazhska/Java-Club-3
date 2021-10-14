package com.softserve.team1.models;

public class LombokEncapsulation {

    private int number;
    private String stringValue;
    private Object anObject;

    public LombokEncapsulation() {
    }

    public LombokEncapsulation(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    @Override
    public String toString() {
        return "LombokEncapsulation{" +
                "number=" + number +
                ", stringValue='" + stringValue + '\'' +
                ", anObject=" + anObject +
                '}';
    }
}
