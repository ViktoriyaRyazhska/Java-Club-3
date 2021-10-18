package com.softserve.team1.kata.impl;


import com.softserve.team1.kata.impl.BaseKata;
import org.testng.Assert;

public class BuildingBlocks extends BaseKata {

    public class Block {
        private int width;
        private int length;
        private int height;

        public Block(int [] arr){
            this.width = arr[0];
            this.length = arr[1];
            this.height = arr[2];
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
            return height * width * length;
        }

        public int getSurfaceArea(){
            return (height * length + height * width + width * length) * 2;
        }
    }

    @Override
    public void test() {
        Block b = new Block(new int[]{2,2,2});
        Assert.assertEquals(2,b.getWidth());
        Assert.assertEquals(2,b.getLength());
        Assert.assertEquals(2,b.getHeight());
        Assert.assertEquals(8,b.getVolume());
        Assert.assertEquals(24,b.getSurfaceArea());

    }
}
