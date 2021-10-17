package com.club3.java.utils;

public class Block {
    private int width;
    private int length;
    private int height;
    private int surface_area;

    public Block(int[] params) {
        width = params[0];
        length = params[1];
        height = params[2];

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    @Override
    public String toString() {
        return "Block{" +
                "width =" + width +
                ", length =" + length +
                ", height =" + height +
                ", volume =" + getVolume()+
                ", surface area =" + getSurfaceArea() +
                '}';
    }
}
