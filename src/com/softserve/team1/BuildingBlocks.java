package com.softserve.team1;

public class BuildingBlocks {
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
}
