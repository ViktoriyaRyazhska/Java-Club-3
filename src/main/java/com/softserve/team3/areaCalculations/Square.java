package team3.main.java.romanS.appParts.areaCalculations;

public class Square implements Shape{
    private int side;


    public double GetTotalArea() {
        return Math.pow(this.side, 2);
    }

    public Square(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
}
