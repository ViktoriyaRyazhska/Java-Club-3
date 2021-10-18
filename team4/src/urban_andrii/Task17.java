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

        public static void main(String[] args) {
            Task17 block = new Task17(1, 2, 3);
            System.out.println(block.getWidth());
            System.out.println(block.getLength());
            System.out.println(block.getHeight());
            System.out.println(block.getVolume());
            System.out.println(block.getSurfaceArea());
        }
}

