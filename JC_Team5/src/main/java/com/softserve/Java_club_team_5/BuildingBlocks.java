package com.softserve.Java_club_team_5;

public class BuildingBlocks {

    private final int width;
    private final int length;
    private final int height;


    BuildingBlocks(int[] values){
        this.width = values[0];
        this.length = values[1];
        this.height = values[2];
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getVolume() {
        return height * width * length;
    }

    public int getSurfaceArea(){
        return (height * length + height * width + width * length) * 2;
    }

}
