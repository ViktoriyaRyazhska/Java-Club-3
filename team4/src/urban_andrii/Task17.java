package urban_andrii;

public class Task17 {
    private int width;
    private int length;
    private int height;

        public Task17(int width, int length, int height) {
            this.width = width;
            this.length = length;
            this.height = height;
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

        public int getVolume(){
            return width*length*height;
        }

        public int getSurfaceArea(){
            return 2*(width*length+length*height+width*height);
        }
}

